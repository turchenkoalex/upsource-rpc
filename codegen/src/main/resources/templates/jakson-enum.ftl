package ${filePackage}

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.ser.std.StdSerializer

class ${enum.name}Deserializer : StdDeserializer<${enum.name}>(${enum.name}::class.java) {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext): ${enum.name}? {
		return ${enum.name}.fromValue(p.byteValue)
	}
}

class ${enum.name}Serializer : StdSerializer<${enum.name}>(${enum.name}::class.java) {
	override fun serialize(value: ${enum.name}, gen: JsonGenerator, provider: SerializerProvider) {
		gen.writeNumber(value.value.toShort())
	}
}
