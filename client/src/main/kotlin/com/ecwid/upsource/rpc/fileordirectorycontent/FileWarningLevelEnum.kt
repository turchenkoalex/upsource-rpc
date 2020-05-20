package com.ecwid.upsource.rpc.fileordirectorycontent

/**
 * Describes PSI inspections level
 */
enum class FileWarningLevelEnum(val value: Byte, val originalName: String) {
	NONE(value = 1, originalName = "none"),
	OK(value = 2, originalName = "ok"),
	WARNING(value = 3, originalName = "warning"),
	ERROR(value = 4, originalName = "error");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
