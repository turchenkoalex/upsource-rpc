package com.ecwid.upsource.rpc.projects

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class AppConfigurationProblemEnumDeserializer : StdDeserializer<AppConfigurationProblemEnum>(AppConfigurationProblemEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): AppConfigurationProblemEnum? {
		return AppConfigurationProblemEnum.fromValue(p.byteValue)
	}
}

class AppConfigurationProblemEnumSerializer : StdSerializer<AppConfigurationProblemEnum>(AppConfigurationProblemEnum::class.java) {
	override fun serialize(value: AppConfigurationProblemEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
