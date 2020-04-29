package com.ecwid.upsource.rpc.files

import com.google.gson.*
import java.lang.reflect.Type

internal class InspectionSeverityEnumTypeAdapter :
	JsonDeserializer<InspectionSeverityEnum>,
	JsonSerializer<InspectionSeverityEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): InspectionSeverityEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return InspectionSeverityEnum.fromValue(value)
					?: throw Error("Value $value not found in enum InspectionSeverityEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum InspectionSeverityEnum values")
			}
		}
		throw Error("Value $json can't be translated to InspectionSeverityEnum")
	}

	override fun serialize(
		src: InspectionSeverityEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
