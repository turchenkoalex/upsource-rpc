package com.ecwid.upsource.rpc.projects

import com.google.gson.*
import java.lang.reflect.Type

internal class SyncResultEnumTypeAdapter :
	JsonDeserializer<SyncResultEnum>,
	JsonSerializer<SyncResultEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): SyncResultEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return SyncResultEnum.fromValue(value)
					?: throw Error("Value $value not found in enum SyncResultEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum SyncResultEnum values")
			}
		}
		throw Error("Value $json can't be translated to SyncResultEnum")
	}

	override fun serialize(
		src: SyncResultEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
