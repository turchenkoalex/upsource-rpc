package com.ecwid.upsource.codegen

import com.ecwid.upsource.codegen.resources.Resources
import com.ecwid.upsource.codegen.schema.EnumType
import com.ecwid.upsource.codegen.schema.EnumValue
import com.ecwid.upsource.codegen.schema.Schema
import com.ecwid.upsource.codegen.schema.UpsourceFile
import com.google.gson.Gson
import java.util.*
import java.util.logging.Logger

private val log = Logger.getLogger(UpsourceFileLoader::class.qualifiedName)

class UpsourceFileLoader(
	private val resources: Resources
) {
	fun loadUpsourceFile(fileName: String): UpsourceFile {
		val subpackage = fileName.lowercase(Locale.US).removeSuffix(".json")
		val fullPackage = "$RPC_PACKAGE.$subpackage".removeSuffix(".")

		val content = resources.readResource(fileName)
		if (content == null) {
			log.severe("Can't read file $fileName. Stop processing")
			throw IllegalArgumentException("Can't read file $fileName. Stop processing")
		}

		val schema = Gson().fromJson(content, Schema::class.java)
			?: throw IllegalArgumentException("Can't parse file $fileName. Stop processing")

		return UpsourceFile(
			fileName = fileName,
			fullPackage = fullPackage,
			packageName = subpackage,
			schema = normalizeSchema(schema)
		)
	}

	private fun normalizeSchema(schema: Schema): Schema {
		return schema.copy(
			enums = schema.enums.map(::normalizeEnum)
		)
	}

	private fun normalizeEnum(enumType: EnumType): EnumType {
		return enumType.copy(
			values = enumType.values.map(::normalizeEnumValue)
		)
	}

	private fun normalizeEnumValue(enumValue: EnumValue): EnumValue {
		return enumValue.copy(
			originalName = enumValue.name,
			name = snakeCase(enumValue.name).uppercase(Locale.US)
		)
	}
}
