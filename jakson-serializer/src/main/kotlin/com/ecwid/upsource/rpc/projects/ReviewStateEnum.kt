package com.ecwid.upsource.rpc.projects

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class ReviewStateEnumDeserializer : StdDeserializer<ReviewStateEnum>(ReviewStateEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): ReviewStateEnum? {
		return ReviewStateEnum.fromValue(p.byteValue)
	}
}

class ReviewStateEnumSerializer : StdSerializer<ReviewStateEnum>(ReviewStateEnum::class.java) {
	override fun serialize(value: ReviewStateEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
