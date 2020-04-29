package com.ecwid.upsource.rpc.analytics

import com.google.gson.*
import java.lang.reflect.Type

internal class ReviewCoverageStateEnumTypeAdapter :
	JsonDeserializer<ReviewCoverageStateEnum>,
	JsonSerializer<ReviewCoverageStateEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): ReviewCoverageStateEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return ReviewCoverageStateEnum.fromValue(value)
					?: throw Error("Value $value not found in enum ReviewCoverageStateEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum ReviewCoverageStateEnum values")
			}
		}
		throw Error("Value $json can't be translated to ReviewCoverageStateEnum")
	}

	override fun serialize(
		src: ReviewCoverageStateEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
