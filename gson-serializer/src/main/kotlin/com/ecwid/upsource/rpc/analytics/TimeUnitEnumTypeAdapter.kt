// Generated by the codegen. Please DO NOT EDIT!
// source: gson-enum-typeadapter.ftl

package com.ecwid.upsource.rpc.analytics

import com.google.gson.*
import java.lang.reflect.Type

internal class TimeUnitEnumTypeAdapter :
	JsonDeserializer<TimeUnitEnum>,
	JsonSerializer<TimeUnitEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): TimeUnitEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return TimeUnitEnum.fromValue(value)
					?: throw Error("Value $value not found in enum TimeUnitEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum TimeUnitEnum values")
			}
		}
		throw Error("Value $json can't be translated to TimeUnitEnum")
	}

	override fun serialize(
		src: TimeUnitEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
