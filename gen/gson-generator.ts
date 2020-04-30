import {Dirs, UpsourceData} from "./types";
import {TypeMapping} from "./type-mapping";
import {createKtFile, SERIALIZER_PACKAGE, typeAdapterPackage} from "./helpers";

export const createGsonTypeAdapters = (dirs: Dirs, data: UpsourceData, mapping: TypeMapping) => {
    if (!data.schema.enums) {
        return;
    }

    const pkg = typeAdapterPackage(data);
    data.schema.enums.forEach(enumType => {
        const content = buildGsonTypeAdapter(pkg, enumType.name, mapping);
        createKtFile(dirs.gsonDir, pkg, `${enumType.name}TypeAdapter`, content);
    })
}

const buildGsonTypeAdapter = (pkg: string, typeName: string, mapping: TypeMapping): string => {
    const typePkg = mapping.findPackage(typeName)
    let importTypePkg = `\nimport ${typePkg}.${typeName}\n`;
    if (typePkg === pkg) {
        importTypePkg = ''
    }

    return `package ${pkg}
        
        import com.google.gson.*${importTypePkg}
        import java.lang.reflect.Type
        
        internal class ${typeName}TypeAdapter :
        	JsonDeserializer<${typeName}>,
        	JsonSerializer<${typeName}> {

        	override fun deserialize(
        		json: JsonElement,
        		typeOfT: Type,
        		context: JsonDeserializationContext
        	): ${typeName} {
        		if (json.isJsonPrimitive) {
        			try {
        				val value = json.asByte
        				return ${typeName}.fromValue(value)
        					?: throw Error("Value $value not found in enum ${typeName}")
        			} catch (e: NumberFormatException) {
        				throw Error("Value $json not parsed for enum ${typeName} values")
        			}
        		}
        		throw Error("Value $json can't be translated to ${typeName}")
        	}

        	override fun serialize(
        		src: ${typeName},
        		typeOfSrc: Type,
        		context: JsonSerializationContext
        	): JsonElement {
        		return JsonPrimitive(src.value)
        	}
        }
`
}

export const createGenericGsonBuilder = (dirs: Dirs, files: UpsourceData[], mapping: TypeMapping) => {
    const enums = []

    files.forEach(file => {
        if (!file.schema.enums) {
            return;
        }
        file.schema.enums.forEach(type => {
            enums.push(type.name);
        })
    });

    enums.sort();

    if (enums.length === 0) {
        return;
    }

    const pkg = SERIALIZER_PACKAGE;
    const content = buildGenericGsonBuilder(pkg, enums, mapping);
    createKtFile(dirs.gsonDir, pkg, `GenericGsonBuilder`, content);
}

const buildGenericGsonBuilder = (pkg: string, enums: string[], mapping: TypeMapping): string => {
    const registrations = enums.map(type => {
        const typePkg = mapping.findPackage(type)

        return `.registerTypeAdapter(
        			${typePkg}.${type}::class.java,
        			${typePkg}.${type}TypeAdapter()
        		)`
    }).join('\n		')

    return `package ${pkg}

        import com.google.gson.GsonBuilder

        internal fun genericGsonBuiler(): GsonBuilder {
        	return GsonBuilder()
        		${registrations}
        }
`
}
