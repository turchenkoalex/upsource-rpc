package com.ecwid.upsource.rpc.projects

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class ProjectStateEnumDeserializer : StdDeserializer<ProjectStateEnum>(ProjectStateEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): ProjectStateEnum? {
		return ProjectStateEnum.fromValue(p.byteValue)
	}
}

class ProjectStateEnumSerializer : StdSerializer<ProjectStateEnum>(ProjectStateEnum::class.java) {
	override fun serialize(value: ProjectStateEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
