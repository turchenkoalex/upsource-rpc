package com.ecwid.upsource.rpc.projects

import com.google.gson.*
import java.lang.reflect.Type

internal class ReadEnumTypeAdapter :
	JsonDeserializer<ReadEnum>,
	JsonSerializer<ReadEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): ReadEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return ReadEnum.fromValue(value)
					?: throw Error("Value $value not found in enum ReadEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum ReadEnum values")
			}
		}
		throw Error("Value $json can't be translated to ReadEnum")
	}

	override fun serialize(
		src: ReadEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
