package com.ecwid.upsource.rpc.projects

import com.google.gson.*
import java.lang.reflect.Type

internal class ConflictTypeEnumTypeAdapter :
	JsonDeserializer<ConflictTypeEnum>,
	JsonSerializer<ConflictTypeEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): ConflictTypeEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return ConflictTypeEnum.fromValue(value)
					?: throw Error("Value $value not found in enum ConflictTypeEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum ConflictTypeEnum values")
			}
		}
		throw Error("Value $json can't be translated to ConflictTypeEnum")
	}

	override fun serialize(
		src: ConflictTypeEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
