package ${filePackage}

import com.google.gson.*
<#list imports as import>
import ${import}
</#list>
import java.lang.reflect.Type

internal class ${enum.name}TypeAdapter :
	JsonDeserializer<${enum.name}>,
	JsonSerializer<${enum.name}> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): ${enum.name} {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return ${enum.name}.fromValue(value)
					?: throw Error("Value $value not found in enum ${enum.name}")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum ${enum.name} values")
			}
		}
		throw Error("Value $json can't be translated to ${enum.name}")
	}

	override fun serialize(
		src: ${enum.name},
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
