package com.ecwid.upsource.rpc.files

import com.google.gson.*
import java.lang.reflect.Type

internal class FileWarningLevelEnumTypeAdapter :
	JsonDeserializer<FileWarningLevelEnum>,
	JsonSerializer<FileWarningLevelEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): FileWarningLevelEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return FileWarningLevelEnum.fromValue(value)
					?: throw Error("Value $value not found in enum FileWarningLevelEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum FileWarningLevelEnum values")
			}
		}
		throw Error("Value $json can't be translated to FileWarningLevelEnum")
	}

	override fun serialize(
		src: FileWarningLevelEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
