package com.ecwid.upsource.codegen

import com.ecwid.upsource.codegen.schema.EnumType
import com.ecwid.upsource.codegen.schema.UpsourceFile

class TypeMapping(
	files: List<UpsourceFile>
) {
	private val typePackages: Map<String, String>
	private val enumDefaultValues: Map<String, String>

	init {
		val mapping = mutableMapOf<String, String>()
		val enumDefaults = mutableMapOf<String, String>()

		files.forEach { file ->
			file.schema.enums.forEach { enum ->
				mapping[enum.name] = file.fullPackage
				enumDefaults[enum.name] = enumDefaultValue(enum)
			}

			file.schema.messages.forEach { message ->
				mapping[message.name] = file.fullPackage
			}
		}

		typePackages = mapping
		enumDefaultValues = enumDefaults
	}

	private fun enumDefaultValue(enum: EnumType): String {
		val firstValue = enum.values.first()
		return "${enum.name}.${firstValue.name}"
	}

	fun findPackage(typeName: String): String? {
		return typePackages[typeName]
	}

	fun isEnum(typeName: String): Boolean {
		return enumDefaultValues.containsKey(typeName)
	}

	fun enumDefaultValue(typeName: String): String {
		return enumDefaultValues[typeName] ?: ""
	}
}
