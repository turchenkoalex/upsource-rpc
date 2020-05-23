package com.ecwid.upsource.rpc.users

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class EmailStatusEnumDeserializer : StdDeserializer<EmailStatusEnum>(EmailStatusEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): EmailStatusEnum? {
		return EmailStatusEnum.fromValue(p.byteValue)
	}
}

class EmailStatusEnumSerializer : StdSerializer<EmailStatusEnum>(EmailStatusEnum::class.java) {
	override fun serialize(value: EmailStatusEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
