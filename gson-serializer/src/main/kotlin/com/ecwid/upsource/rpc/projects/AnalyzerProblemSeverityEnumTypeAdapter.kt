package com.ecwid.upsource.rpc.projects

import com.google.gson.*
import java.lang.reflect.Type

internal class AnalyzerProblemSeverityEnumTypeAdapter :
	JsonDeserializer<AnalyzerProblemSeverityEnum>,
	JsonSerializer<AnalyzerProblemSeverityEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): AnalyzerProblemSeverityEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return AnalyzerProblemSeverityEnum.fromValue(value)
					?: throw Error("Value $value not found in enum AnalyzerProblemSeverityEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum AnalyzerProblemSeverityEnum values")
			}
		}
		throw Error("Value $json can't be translated to AnalyzerProblemSeverityEnum")
	}

	override fun serialize(
		src: AnalyzerProblemSeverityEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
