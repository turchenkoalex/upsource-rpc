package com.ecwid.upsource.rpc.users

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class RoleInReviewEnumDeserializer : StdDeserializer<RoleInReviewEnum>(RoleInReviewEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): RoleInReviewEnum? {
		return RoleInReviewEnum.fromValue(p.byteValue)
	}
}

class RoleInReviewEnumSerializer : StdSerializer<RoleInReviewEnum>(RoleInReviewEnum::class.java) {
	override fun serialize(value: RoleInReviewEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
