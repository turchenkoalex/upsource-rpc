const {readFileSync, mkdirSync, writeFileSync} = require("fs");
const ROOT_PACKAGE = 'com.ecwid.upsource';
const RPC_PACKAGE = `${ROOT_PACKAGE}.rpc`;

const enumPackage = (file) => `${file.package}`

const messagesPackage = (file) => `${file.package}`

const typeAdapterPackage = (file) => `${file.package}`

const cleanWhitespace = (content) => {
    return content
        .replace(new RegExp(' {8}', 'g'), '')
        .replace(new RegExp(' {4}', 'g'), '\t');
}

const findArgumentType = (typeName, basePackage, mapping) => {
    const cleanName = typeName.replace('messages.', '');
    const typePackage = mapping[cleanName];

    if (!!typePackage && typePackage !== basePackage) {
        return `${typePackage}.${cleanName}`;
    }

    return cleanName;
}

const buildMethod = (method, basePackage, mapping) => {
    const argumentType = findArgumentType(method.argumentType, basePackage, mapping);
    const returnType = findArgumentType(method.returnType, basePackage, mapping);
    return `
            /**
             * ${method.description}
             */
            fun ${method.name}(request: ${argumentType}): RpcResponse<${returnType}>`;
}

const buildMethodImpl = (method, basePackage, mapping) => {
    const argumentType = findArgumentType(method.argumentType, basePackage, mapping);
    const returnType = findArgumentType(method.returnType, basePackage, mapping);
    return `
            override fun ${method.name}(request: ${argumentType}): RpcResponse<${returnType}> {
            	val body = serializer.serialize(request)
            	val transportResponse = transport.makeRequest("${method.name}", body)
            	val clazz = ${returnType}::class.java
            	return serializer.deserialize(transportResponse, clazz)
            }`;
}

const buildService = (pkg, service, mapping) => {
    const methods = service.methods.map(method =>
        buildMethod(method, pkg, mapping)
    ).join('\n')

    return `package ${pkg}

        import ${ROOT_PACKAGE}.transport.RpcResponse

        /**
         * ${service.description}
         */
        interface ${service.name} {
${methods}
        }
        `;
}

const buildServiceImpl = (pkg, service, mapping) => {
    const methods = service.methods.map(method =>
        buildMethodImpl(method, pkg, mapping)
    ).join('\n')

    return `package ${pkg}

        import ${RPC_PACKAGE}.UpsourceRPC
        import ${ROOT_PACKAGE}.serializer.Serializer
        import ${ROOT_PACKAGE}.transport.RpcResponse
        import ${ROOT_PACKAGE}.transport.RpcTransport

        /**
         * ${service.description} implementation
         */
        internal class ${service.name}Impl(
        	private val transport: RpcTransport,
        	private val serializer: Serializer
        ) : ${service.name} {
${methods}
        }
        `;
}

const buildGsonTypeAdapter = (pkg, typeName, mapping) => {
    let typePkg = mapping[typeName]
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

const createKtFile = (dir, pkg, name, content) => {
    const path = dir + '/' + pkg.replace(new RegExp('\\.', 'g'), '/');
    mkdirSync(path, {recursive: true});
    writeFileSync(`${path}/${name}.kt`, cleanWhitespace(content));
}

const createServices = (dir, pkg, schema, mapping) => {
    if (!schema.services) {
        return;
    }

    schema.services.forEach(service => {
        const serviceContent = buildService(pkg, service, mapping);
        createKtFile(dir, pkg, service.name, serviceContent);

        const implPackage = `${pkg}.impl`;
        const serviceImplContent = buildServiceImpl(implPackage, service, mapping);
        createKtFile(dir, implPackage, `${service.name}Impl`, serviceImplContent);
    })
}

const TYPE_MAP = {
    'Int32': 'Int',
    'String': 'String',
    'Bool': 'Boolean',
    'Int64': 'Long'
}

const findType = (type, label, pkg, mapping) => {
    let foundType = TYPE_MAP[type];
    if (!foundType) {

        const typePackage = mapping[type];
        if (typePackage && pkg !== typePackage) {
            foundType = `${typePackage}.${type}`
        } else {
            foundType = type;
        }
    }

    if (label === 'required') {
        return foundType;
    }

    if (label === 'optional') {
        return `${foundType}?`;
    }

    if (label === 'repeated') {
        return `List<${foundType}>`;
    }

    throw new Error(`Unknown type label ${label}`);
}

const buildField = (field, pkg, mapping) => {
    const fieldType = findType(field.type, field.label, pkg, mapping);
    return `
        	/**
        	 * ${field.description} (${field.label})
        	 */
        	val ${field.name}: ${fieldType}`;
}

const buildMessage = (pkg, message, mapping) => {
    const fields = message.fields.map(field =>
        buildField(field, pkg, mapping)
    ).join(',\n');

    return `package ${pkg}

        data class ${message.name}(${fields}
        )`;
}

const createMessages = (dir, pkg, schema, mapping) => {
    if (!schema.messages) {
        return;
    }

    schema.messages.forEach(message => {
        const messageContent = buildMessage(pkg, message, mapping);
        createKtFile(dir, pkg, message.name, messageContent);
    })
}

const buildEnumValue = (value) => {
    return `
        	${value.name}(${value.number})`;
}

const buildEnum = (pkg, enumType) => {
    const values = enumType.values.map(buildEnumValue).join(',');

    return `package ${pkg}

        /**
         * ${enumType.description}
         */
        enum class ${enumType.name}(val value: Byte) {${values};

        	companion object {
        		private val MAP_BY_VALUES = values().associateBy { it.value }
        		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
        	}
        }`;
}

const createEnums = (dir, pkg, schema) => {
    if (!schema.enums) {
        return;
    }

    schema.enums.forEach(enumType => {
        const enumContent = buildEnum(pkg, enumType);
        createKtFile(dir, pkg, enumType.name, enumContent);
    })
}

const createTypeAdapters = (dir, pkg, schema, mapping) => {
    if (!schema.enums) {
        return;
    }

    schema.enums.forEach(enumType => {
        const enumAdapterContent = buildGsonTypeAdapter(pkg, enumType.name, mapping);
        createKtFile(dir, pkg, `${enumType.name}TypeAdapter`, enumAdapterContent);
    })
}

const buildGenericGsonBuilder = (pkg, enums, mapping) => {
    enums.sort()

    const registrations = enums.map(type => {
        const typePkg = mapping[type]

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


const createGenericGsonBuilder = (dir, pkg, enums, mapping) => {
    if (enums.length === 0) {
        return;
    }

    const content = buildGenericGsonBuilder(pkg, enums, mapping);
    createKtFile(dir, pkg, `GenericGsonBuilder`, content);
}


const processFile = (rootSrcDir, gsonSrcDir, file, mapping) => {
    createEnums(rootSrcDir, enumPackage(file), file.schema);
    createTypeAdapters(gsonSrcDir, typeAdapterPackage(file), file.schema, mapping);
    createMessages(rootSrcDir, messagesPackage(file), file.schema, mapping);
    createServices(rootSrcDir, file.package, file.schema, mapping);
    console.log(`File ${file.fileName} processed`)
}

const buildTypeMapping = (file) => {
    const mapping = {}

    if (file.schema.enums) {
        file.schema.enums.forEach(type => {
            mapping[type.name] = enumPackage(file);
        });
    }

    if (file.schema.messages) {
        file.schema.messages.forEach(type => {
            mapping[type.name] = messagesPackage(file);
        });
    }

    return mapping;
}

function main() {
    const rootSrcDir = '../client/src/main/kotlin';
    const gsonSrcDir = '../gson-serializer/src/main/kotlin';

    const files = [
        {
            subpackage: '',
            fileName: 'Ids.json'
        },
        {
            subpackage: `projects`,
            fileName: 'Projects.json'
        },
        {
            subpackage: `users`,
            fileName: 'Users.json'
        },
        {
            subpackage: `issuetrackers`,
            fileName: 'IssueTrackers.json'
        },
        {
            subpackage: `misc`,
            fileName: 'Misc.json'
        },
        {
            subpackage: `analytics`,
            fileName: 'Analytics.json'
        },
        {
            subpackage: `findusages`,
            fileName: 'FindUsages.json'
        },
        {
            subpackage: `files`,
            fileName: 'FileOrDirectoryContent.json'
        },
        {
            subpackage: '',
            fileName: 'Service.json'
        }
    ]

    // load json
    files.forEach(file => {
        if (!file.subpackage) {
            file.package = RPC_PACKAGE;
        } else {
            file.package = `${RPC_PACKAGE}.${file.subpackage}`;
        }
        file.schema = JSON.parse(readFileSync(`./schemas/${file.fileName}`));
    });

    const mapping = files
        .map(buildTypeMapping)
        .reduce(Object.assign, {});

    files.forEach(file => {
        processFile(rootSrcDir, gsonSrcDir, file, mapping)
    });

    const enums = files
        .map(file => {
            if (!file.schema.enums) {
                return [];
            }

            return file.schema.enums
        })
        .flatMap(types => types)
        .map(type => type.name)

    createGenericGsonBuilder(gsonSrcDir, `${ROOT_PACKAGE}.serializer`, enums, mapping)
}

main()
