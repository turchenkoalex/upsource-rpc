// Generated by the codegen. Please DO NOT EDIT!
// source: jackson-enum.ftl

package com.ecwid.upsource.rpc.projects

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class ConflictTypeEnumDeserializer : StdDeserializer<ConflictTypeEnum>(ConflictTypeEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): ConflictTypeEnum? {
		return ConflictTypeEnum.fromValue(p.byteValue)
	}
}

class ConflictTypeEnumSerializer : StdSerializer<ConflictTypeEnum>(ConflictTypeEnum::class.java) {
	override fun serialize(value: ConflictTypeEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}