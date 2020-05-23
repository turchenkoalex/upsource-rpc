package com.ecwid.upsource.rpc.projects

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class AnalyzerProblemSeverityEnumDeserializer : StdDeserializer<AnalyzerProblemSeverityEnum>(AnalyzerProblemSeverityEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): AnalyzerProblemSeverityEnum? {
		return AnalyzerProblemSeverityEnum.fromValue(p.byteValue)
	}
}

class AnalyzerProblemSeverityEnumSerializer : StdSerializer<AnalyzerProblemSeverityEnum>(AnalyzerProblemSeverityEnum::class.java) {
	override fun serialize(value: AnalyzerProblemSeverityEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
