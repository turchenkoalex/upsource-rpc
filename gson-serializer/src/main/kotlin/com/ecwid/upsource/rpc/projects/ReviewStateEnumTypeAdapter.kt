package com.ecwid.upsource.rpc.projects

import com.google.gson.*
import java.lang.reflect.Type

internal class ReviewStateEnumTypeAdapter :
	JsonDeserializer<ReviewStateEnum>,
	JsonSerializer<ReviewStateEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): ReviewStateEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return ReviewStateEnum.fromValue(value)
					?: throw Error("Value $value not found in enum ReviewStateEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum ReviewStateEnum values")
			}
		}
		throw Error("Value $json can't be translated to ReviewStateEnum")
	}

	override fun serialize(
		src: ReviewStateEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
