package com.ecwid.upsource.rpc.projects

import com.google.gson.*
import java.lang.reflect.Type

internal class ParticipantStateEnumTypeAdapter :
	JsonDeserializer<ParticipantStateEnum>,
	JsonSerializer<ParticipantStateEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): ParticipantStateEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return ParticipantStateEnum.fromValue(value)
					?: throw Error("Value $value not found in enum ParticipantStateEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum ParticipantStateEnum values")
			}
		}
		throw Error("Value $json can't be translated to ParticipantStateEnum")
	}

	override fun serialize(
		src: ParticipantStateEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
