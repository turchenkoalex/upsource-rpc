package com.ecwid.upsource.rpc.misc

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class WebhookEventEnumDeserializer : StdDeserializer<WebhookEventEnum>(WebhookEventEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): WebhookEventEnum? {
		return WebhookEventEnum.fromValue(p.byteValue)
	}
}

class WebhookEventEnumSerializer : StdSerializer<WebhookEventEnum>(WebhookEventEnum::class.java) {
	override fun serialize(value: WebhookEventEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
