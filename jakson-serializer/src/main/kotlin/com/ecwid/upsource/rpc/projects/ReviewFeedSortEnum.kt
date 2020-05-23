package com.ecwid.upsource.rpc.projects

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class ReviewFeedSortEnumDeserializer : StdDeserializer<ReviewFeedSortEnum>(ReviewFeedSortEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): ReviewFeedSortEnum? {
		return ReviewFeedSortEnum.fromValue(p.byteValue)
	}
}

class ReviewFeedSortEnumSerializer : StdSerializer<ReviewFeedSortEnum>(ReviewFeedSortEnum::class.java) {
	override fun serialize(value: ReviewFeedSortEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
