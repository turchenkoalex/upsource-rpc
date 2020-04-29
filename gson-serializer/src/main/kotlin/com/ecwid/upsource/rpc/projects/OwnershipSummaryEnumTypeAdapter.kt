package com.ecwid.upsource.rpc.projects

import com.google.gson.*
import java.lang.reflect.Type

internal class OwnershipSummaryEnumTypeAdapter :
	JsonDeserializer<OwnershipSummaryEnum>,
	JsonSerializer<OwnershipSummaryEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): OwnershipSummaryEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return OwnershipSummaryEnum.fromValue(value)
					?: throw Error("Value $value not found in enum OwnershipSummaryEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum OwnershipSummaryEnum values")
			}
		}
		throw Error("Value $json can't be translated to OwnershipSummaryEnum")
	}

	override fun serialize(
		src: OwnershipSummaryEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
