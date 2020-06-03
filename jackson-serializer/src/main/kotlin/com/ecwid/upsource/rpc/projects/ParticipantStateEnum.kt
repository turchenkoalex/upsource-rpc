package com.ecwid.upsource.rpc.projects

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class ParticipantStateEnumDeserializer : StdDeserializer<ParticipantStateEnum>(ParticipantStateEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): ParticipantStateEnum? {
		return ParticipantStateEnum.fromValue(p.byteValue)
	}
}

class ParticipantStateEnumSerializer : StdSerializer<ParticipantStateEnum>(ParticipantStateEnum::class.java) {
	override fun serialize(value: ParticipantStateEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
