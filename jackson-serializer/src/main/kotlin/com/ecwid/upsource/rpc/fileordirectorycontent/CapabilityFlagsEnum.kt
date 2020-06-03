package com.ecwid.upsource.rpc.fileordirectorycontent

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class CapabilityFlagsEnumDeserializer : StdDeserializer<CapabilityFlagsEnum>(CapabilityFlagsEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): CapabilityFlagsEnum? {
		return CapabilityFlagsEnum.fromValue(p.byteValue)
	}
}

class CapabilityFlagsEnumSerializer : StdSerializer<CapabilityFlagsEnum>(CapabilityFlagsEnum::class.java) {
	override fun serialize(value: CapabilityFlagsEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
