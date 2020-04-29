package com.ecwid.upsource.rpc.projects

import com.google.gson.*
import java.lang.reflect.Type

internal class FeedTypeEnumTypeAdapter :
	JsonDeserializer<FeedTypeEnum>,
	JsonSerializer<FeedTypeEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): FeedTypeEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return FeedTypeEnum.fromValue(value)
					?: throw Error("Value $value not found in enum FeedTypeEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum FeedTypeEnum values")
			}
		}
		throw Error("Value $json can't be translated to FeedTypeEnum")
	}

	override fun serialize(
		src: FeedTypeEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
