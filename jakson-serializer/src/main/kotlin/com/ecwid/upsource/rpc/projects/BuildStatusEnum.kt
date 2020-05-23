package com.ecwid.upsource.rpc.projects

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class BuildStatusEnumDeserializer : StdDeserializer<BuildStatusEnum>(BuildStatusEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): BuildStatusEnum? {
		return BuildStatusEnum.fromValue(p.byteValue)
	}
}

class BuildStatusEnumSerializer : StdSerializer<BuildStatusEnum>(BuildStatusEnum::class.java) {
	override fun serialize(value: BuildStatusEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
