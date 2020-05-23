package com.ecwid.upsource.rpc.projects

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class RevisionReachabilityEnumDeserializer : StdDeserializer<RevisionReachabilityEnum>(RevisionReachabilityEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): RevisionReachabilityEnum? {
		return RevisionReachabilityEnum.fromValue(p.byteValue)
	}
}

class RevisionReachabilityEnumSerializer : StdSerializer<RevisionReachabilityEnum>(RevisionReachabilityEnum::class.java) {
	override fun serialize(value: RevisionReachabilityEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
