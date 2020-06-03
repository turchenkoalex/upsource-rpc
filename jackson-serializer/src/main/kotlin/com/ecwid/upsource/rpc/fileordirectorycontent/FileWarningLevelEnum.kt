package com.ecwid.upsource.rpc.fileordirectorycontent

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class FileWarningLevelEnumDeserializer : StdDeserializer<FileWarningLevelEnum>(FileWarningLevelEnum::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): FileWarningLevelEnum? {
		return FileWarningLevelEnum.fromValue(p.byteValue)
	}
}

class FileWarningLevelEnumSerializer : StdSerializer<FileWarningLevelEnum>(FileWarningLevelEnum::class.java) {
	override fun serialize(value: FileWarningLevelEnum, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
