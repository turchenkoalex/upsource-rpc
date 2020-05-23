package com.ecwid.upsource.rpc.projects

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class SyncResultEnumDeserializer : StdDeserializer<SyncResultEnum>(SyncResultEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): SyncResultEnum? {
		return SyncResultEnum.fromValue(p.byteValue)
	}
}

class SyncResultEnumSerializer : StdSerializer<SyncResultEnum>(SyncResultEnum::class.java) {
	override fun serialize(value: SyncResultEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
