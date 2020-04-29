package com.ecwid.upsource.rpc.misc

import com.google.gson.*
import java.lang.reflect.Type

internal class WebhookEventEnumTypeAdapter :
	JsonDeserializer<WebhookEventEnum>,
	JsonSerializer<WebhookEventEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): WebhookEventEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return WebhookEventEnum.fromValue(value)
					?: throw Error("Value $value not found in enum WebhookEventEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum WebhookEventEnum values")
			}
		}
		throw Error("Value $json can't be translated to WebhookEventEnum")
	}

	override fun serialize(
		src: WebhookEventEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
