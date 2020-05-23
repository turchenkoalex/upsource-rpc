package com.ecwid.upsource.rpc.projects

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class FeedTypeEnumDeserializer : StdDeserializer<FeedTypeEnum>(FeedTypeEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): FeedTypeEnum? {
		return FeedTypeEnum.fromValue(p.byteValue)
	}
}

class FeedTypeEnumSerializer : StdSerializer<FeedTypeEnum>(FeedTypeEnum::class.java) {
	override fun serialize(value: FeedTypeEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
