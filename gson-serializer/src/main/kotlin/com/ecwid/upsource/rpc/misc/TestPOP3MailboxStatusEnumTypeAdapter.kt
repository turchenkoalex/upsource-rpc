package com.ecwid.upsource.rpc.misc

import com.google.gson.*
import java.lang.reflect.Type

internal class TestPOP3MailboxStatusEnumTypeAdapter :
	JsonDeserializer<TestPOP3MailboxStatusEnum>,
	JsonSerializer<TestPOP3MailboxStatusEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): TestPOP3MailboxStatusEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return TestPOP3MailboxStatusEnum.fromValue(value)
					?: throw Error("Value $value not found in enum TestPOP3MailboxStatusEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum TestPOP3MailboxStatusEnum values")
			}
		}
		throw Error("Value $json can't be translated to TestPOP3MailboxStatusEnum")
	}

	override fun serialize(
		src: TestPOP3MailboxStatusEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
