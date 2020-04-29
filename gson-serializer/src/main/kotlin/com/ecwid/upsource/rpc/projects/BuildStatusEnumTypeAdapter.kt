package com.ecwid.upsource.rpc.projects

import com.google.gson.*
import java.lang.reflect.Type

internal class BuildStatusEnumTypeAdapter :
	JsonDeserializer<BuildStatusEnum>,
	JsonSerializer<BuildStatusEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): BuildStatusEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return BuildStatusEnum.fromValue(value)
					?: throw Error("Value $value not found in enum BuildStatusEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum BuildStatusEnum values")
			}
		}
		throw Error("Value $json can't be translated to BuildStatusEnum")
	}

	override fun serialize(
		src: BuildStatusEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
