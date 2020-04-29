package com.ecwid.upsource.rpc.projects

import com.google.gson.*
import java.lang.reflect.Type

internal class RevisionStateEnumTypeAdapter :
	JsonDeserializer<RevisionStateEnum>,
	JsonSerializer<RevisionStateEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): RevisionStateEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return RevisionStateEnum.fromValue(value)
					?: throw Error("Value $value not found in enum RevisionStateEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum RevisionStateEnum values")
			}
		}
		throw Error("Value $json can't be translated to RevisionStateEnum")
	}

	override fun serialize(
		src: RevisionStateEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
