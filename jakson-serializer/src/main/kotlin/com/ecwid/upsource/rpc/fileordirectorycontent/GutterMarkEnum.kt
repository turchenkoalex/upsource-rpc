package com.ecwid.upsource.rpc.fileordirectorycontent

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class GutterMarkEnumDeserializer : StdDeserializer<GutterMarkEnum>(GutterMarkEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): GutterMarkEnum? {
		return GutterMarkEnum.fromValue(p.byteValue)
	}
}

class GutterMarkEnumSerializer : StdSerializer<GutterMarkEnum>(GutterMarkEnum::class.java) {
	override fun serialize(value: GutterMarkEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
