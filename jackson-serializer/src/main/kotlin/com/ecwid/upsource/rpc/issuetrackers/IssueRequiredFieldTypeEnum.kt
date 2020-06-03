package com.ecwid.upsource.rpc.issuetrackers

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class IssueRequiredFieldTypeEnumDeserializer : StdDeserializer<IssueRequiredFieldTypeEnum>(IssueRequiredFieldTypeEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): IssueRequiredFieldTypeEnum? {
		return IssueRequiredFieldTypeEnum.fromValue(p.byteValue)
	}
}

class IssueRequiredFieldTypeEnumSerializer : StdSerializer<IssueRequiredFieldTypeEnum>(IssueRequiredFieldTypeEnum::class.java) {
	override fun serialize(value: IssueRequiredFieldTypeEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
