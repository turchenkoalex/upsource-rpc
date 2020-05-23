package com.ecwid.upsource.rpc.analytics

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class TimeUnitEnumDeserializer : StdDeserializer<TimeUnitEnum>(TimeUnitEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): TimeUnitEnum? {
		return TimeUnitEnum.fromValue(p.byteValue)
	}
}

class TimeUnitEnumSerializer : StdSerializer<TimeUnitEnum>(TimeUnitEnum::class.java) {
	override fun serialize(value: TimeUnitEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
