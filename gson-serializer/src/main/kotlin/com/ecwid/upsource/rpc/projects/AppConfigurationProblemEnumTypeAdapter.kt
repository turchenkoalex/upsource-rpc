package com.ecwid.upsource.rpc.projects

import com.google.gson.*
import java.lang.reflect.Type

internal class AppConfigurationProblemEnumTypeAdapter :
	JsonDeserializer<AppConfigurationProblemEnum>,
	JsonSerializer<AppConfigurationProblemEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): AppConfigurationProblemEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return AppConfigurationProblemEnum.fromValue(value)
					?: throw Error("Value $value not found in enum AppConfigurationProblemEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum AppConfigurationProblemEnum values")
			}
		}
		throw Error("Value $json can't be translated to AppConfigurationProblemEnum")
	}

	override fun serialize(
		src: AppConfigurationProblemEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
