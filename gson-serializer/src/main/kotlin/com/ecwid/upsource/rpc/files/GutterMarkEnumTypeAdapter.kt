package com.ecwid.upsource.rpc.files

import com.google.gson.*
import java.lang.reflect.Type

internal class GutterMarkEnumTypeAdapter :
	JsonDeserializer<GutterMarkEnum>,
	JsonSerializer<GutterMarkEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): GutterMarkEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return GutterMarkEnum.fromValue(value)
					?: throw Error("Value $value not found in enum GutterMarkEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum GutterMarkEnum values")
			}
		}
		throw Error("Value $json can't be translated to GutterMarkEnum")
	}

	override fun serialize(
		src: GutterMarkEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
