package com.ecwid.upsource.rpc.projects

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class DiffTypeEnumDeserializer : StdDeserializer<DiffTypeEnum>(DiffTypeEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): DiffTypeEnum? {
		return DiffTypeEnum.fromValue(p.byteValue)
	}
}

class DiffTypeEnumSerializer : StdSerializer<DiffTypeEnum>(DiffTypeEnum::class.java) {
	override fun serialize(value: DiffTypeEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
