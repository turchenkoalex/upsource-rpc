package com.ecwid.upsource.rpc.issuetrackers

import com.google.gson.*
import java.lang.reflect.Type

internal class IssueRequiredFieldTypeEnumTypeAdapter :
	JsonDeserializer<IssueRequiredFieldTypeEnum>,
	JsonSerializer<IssueRequiredFieldTypeEnum> {

	override fun deserialize(
		json: JsonElement,
		typeOfT: Type,
		context: JsonDeserializationContext
	): IssueRequiredFieldTypeEnum {
		if (json.isJsonPrimitive) {
			try {
				val value = json.asByte
				return IssueRequiredFieldTypeEnum.fromValue(value)
					?: throw Error("Value $value not found in enum IssueRequiredFieldTypeEnum")
			} catch (e: NumberFormatException) {
				throw Error("Value $json not parsed for enum IssueRequiredFieldTypeEnum values")
			}
		}
		throw Error("Value $json can't be translated to IssueRequiredFieldTypeEnum")
	}

	override fun serialize(
		src: IssueRequiredFieldTypeEnum,
		typeOfSrc: Type,
		context: JsonSerializationContext
	): JsonElement {
		return JsonPrimitive(src.value)
	}
}
