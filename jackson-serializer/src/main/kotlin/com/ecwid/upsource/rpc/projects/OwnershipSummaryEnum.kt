package com.ecwid.upsource.rpc.projects

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class OwnershipSummaryEnumDeserializer : StdDeserializer<OwnershipSummaryEnum>(OwnershipSummaryEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): OwnershipSummaryEnum? {
		return OwnershipSummaryEnum.fromValue(p.byteValue)
	}
}

class OwnershipSummaryEnumSerializer : StdSerializer<OwnershipSummaryEnum>(OwnershipSummaryEnum::class.java) {
	override fun serialize(value: OwnershipSummaryEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
