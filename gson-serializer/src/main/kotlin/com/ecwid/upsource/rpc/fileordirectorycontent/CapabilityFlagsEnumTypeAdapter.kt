package com.ecwid.upsource.rpc.fileordirectorycontent

import com.google.gson.*
import java.lang.reflect.Type

internal class CapabilityFlagsEnumTypeAdapter :
	JsonDeserializer<CapabilityFlagsEnum>,
	JsonSerializer<CapabilityFlagsEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): CapabilityFlagsEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return CapabilityFlagsEnum.fromValue(value)
					?: throw Error("Value $value not found in enum CapabilityFlagsEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum CapabilityFlagsEnum values")
			}
		}
		throw Error("Value $json can't be translated to CapabilityFlagsEnum")
	}

	override fun serialize(
		src: CapabilityFlagsEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}