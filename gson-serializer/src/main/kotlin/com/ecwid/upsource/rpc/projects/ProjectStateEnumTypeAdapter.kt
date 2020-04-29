package com.ecwid.upsource.rpc.projects

import com.google.gson.*
import java.lang.reflect.Type

internal class ProjectStateEnumTypeAdapter :
	JsonDeserializer<ProjectStateEnum>,
	JsonSerializer<ProjectStateEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): ProjectStateEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return ProjectStateEnum.fromValue(value)
					?: throw Error("Value $value not found in enum ProjectStateEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum ProjectStateEnum values")
			}
		}
		throw Error("Value $json can't be translated to ProjectStateEnum")
	}

	override fun serialize(
		src: ProjectStateEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
