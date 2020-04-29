package com.ecwid.upsource.rpc.projects

import com.google.gson.*
import java.lang.reflect.Type

internal class ReviewFeedSortEnumTypeAdapter :
	JsonDeserializer<ReviewFeedSortEnum>,
	JsonSerializer<ReviewFeedSortEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): ReviewFeedSortEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return ReviewFeedSortEnum.fromValue(value)
					?: throw Error("Value $value not found in enum ReviewFeedSortEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum ReviewFeedSortEnum values")
			}
		}
		throw Error("Value $json can't be translated to ReviewFeedSortEnum")
	}

	override fun serialize(
		src: ReviewFeedSortEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
