package com.ecwid.upsource.rpc.fileordirectorycontent

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class InspectionSeverityEnumDeserializer : StdDeserializer<InspectionSeverityEnum>(InspectionSeverityEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): InspectionSeverityEnum? {
		return InspectionSeverityEnum.fromValue(p.byteValue)
	}
}

class InspectionSeverityEnumSerializer : StdSerializer<InspectionSeverityEnum>(InspectionSeverityEnum::class.java) {
	override fun serialize(value: InspectionSeverityEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
