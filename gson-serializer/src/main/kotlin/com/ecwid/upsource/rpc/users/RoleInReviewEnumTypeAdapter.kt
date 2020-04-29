package com.ecwid.upsource.rpc.users

import com.google.gson.*
import java.lang.reflect.Type

internal class RoleInReviewEnumTypeAdapter :
	JsonDeserializer<RoleInReviewEnum>,
	JsonSerializer<RoleInReviewEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): RoleInReviewEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return RoleInReviewEnum.fromValue(value)
					?: throw Error("Value $value not found in enum RoleInReviewEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum RoleInReviewEnum values")
			}
		}
		throw Error("Value $json can't be translated to RoleInReviewEnum")
	}

	override fun serialize(
		src: RoleInReviewEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
