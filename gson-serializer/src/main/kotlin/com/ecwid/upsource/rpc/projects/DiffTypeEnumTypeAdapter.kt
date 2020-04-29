package com.ecwid.upsource.rpc.projects

import com.google.gson.*
import java.lang.reflect.Type

internal class DiffTypeEnumTypeAdapter :
	JsonDeserializer<DiffTypeEnum>,
	JsonSerializer<DiffTypeEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): DiffTypeEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return DiffTypeEnum.fromValue(value)
					?: throw Error("Value $value not found in enum DiffTypeEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum DiffTypeEnum values")
			}
		}
		throw Error("Value $json can't be translated to DiffTypeEnum")
	}

	override fun serialize(
		src: DiffTypeEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
