package com.ecwid.upsource.rpc.users

import com.google.gson.*
import java.lang.reflect.Type

internal class EmailStatusEnumTypeAdapter :
	JsonDeserializer<EmailStatusEnum>,
	JsonSerializer<EmailStatusEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): EmailStatusEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return EmailStatusEnum.fromValue(value)
					?: throw Error("Value $value not found in enum EmailStatusEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum EmailStatusEnum values")
			}
		}
		throw Error("Value $json can't be translated to EmailStatusEnum")
	}

	override fun serialize(
		src: EmailStatusEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
