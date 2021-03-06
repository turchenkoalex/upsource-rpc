// Generated by the codegen. Please DO NOT EDIT!
// source: jackson-enum.ftl

package com.ecwid.upsource.rpc.events

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class NotificationReasonDeserializer : StdDeserializer<NotificationReason>(NotificationReason::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): NotificationReason? {
		return NotificationReason.fromValue(p.byteValue)
	}
}

class NotificationReasonSerializer : StdSerializer<NotificationReason>(NotificationReason::class.java) {
	override fun serialize(value: NotificationReason, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
