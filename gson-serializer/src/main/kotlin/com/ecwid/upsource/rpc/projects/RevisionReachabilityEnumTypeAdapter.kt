package com.ecwid.upsource.rpc.projects

import com.google.gson.*
import java.lang.reflect.Type

internal class RevisionReachabilityEnumTypeAdapter :
	JsonDeserializer<RevisionReachabilityEnum>,
	JsonSerializer<RevisionReachabilityEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): RevisionReachabilityEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return RevisionReachabilityEnum.fromValue(value)
					?: throw Error("Value $value not found in enum RevisionReachabilityEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum RevisionReachabilityEnum values")
			}
		}
		throw Error("Value $json can't be translated to RevisionReachabilityEnum")
	}

	override fun serialize(
		src: RevisionReachabilityEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
