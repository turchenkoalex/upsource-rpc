package com.ecwid.upsource.rpc.projects

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class TestConnectionStatusEnumDeserializer : StdDeserializer<TestConnectionStatusEnum>(TestConnectionStatusEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): TestConnectionStatusEnum? {
		return TestConnectionStatusEnum.fromValue(p.byteValue)
	}
}

class TestConnectionStatusEnumSerializer : StdSerializer<TestConnectionStatusEnum>(TestConnectionStatusEnum::class.java) {
	override fun serialize(value: TestConnectionStatusEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
