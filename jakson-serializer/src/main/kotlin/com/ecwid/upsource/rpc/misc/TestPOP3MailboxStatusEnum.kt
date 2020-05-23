package com.ecwid.upsource.rpc.misc

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class TestPOP3MailboxStatusEnumDeserializer : StdDeserializer<TestPOP3MailboxStatusEnum>(TestPOP3MailboxStatusEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): TestPOP3MailboxStatusEnum? {
		return TestPOP3MailboxStatusEnum.fromValue(p.byteValue)
	}
}

class TestPOP3MailboxStatusEnumSerializer : StdSerializer<TestPOP3MailboxStatusEnum>(TestPOP3MailboxStatusEnum::class.java) {
	override fun serialize(value: TestPOP3MailboxStatusEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
