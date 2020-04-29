package com.ecwid.upsource.rpc.projects

import com.google.gson.*
import java.lang.reflect.Type

internal class TestConnectionStatusEnumTypeAdapter :
	JsonDeserializer<TestConnectionStatusEnum>,
	JsonSerializer<TestConnectionStatusEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): TestConnectionStatusEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return TestConnectionStatusEnum.fromValue(value)
					?: throw Error("Value $value not found in enum TestConnectionStatusEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum TestConnectionStatusEnum values")
			}
		}
		throw Error("Value $json can't be translated to TestConnectionStatusEnum")
	}

	override fun serialize(
		src: TestConnectionStatusEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
