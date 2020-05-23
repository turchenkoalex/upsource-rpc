package com.ecwid.upsource.rpc.analytics

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class ReviewCoverageStateEnumDeserializer : StdDeserializer<ReviewCoverageStateEnum>(ReviewCoverageStateEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): ReviewCoverageStateEnum? {
		return ReviewCoverageStateEnum.fromValue(p.byteValue)
	}
}

class ReviewCoverageStateEnumSerializer : StdSerializer<ReviewCoverageStateEnum>(ReviewCoverageStateEnum::class.java) {
	override fun serialize(value: ReviewCoverageStateEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
