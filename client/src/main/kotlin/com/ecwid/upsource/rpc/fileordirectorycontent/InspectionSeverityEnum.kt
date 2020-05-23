package com.ecwid.upsource.rpc.fileordirectorycontent

/**
 * Describes severity of an inspection result
 */
enum class InspectionSeverityEnum(val value: Byte, val originalName: String) {
	INFORMATION(value = 1, originalName = "information"),
	WEAK_WARNING(value = 2, originalName = "weak_warning"),
	WARNING(value = 3, originalName = "warning"),
	ERROR(value = 4, originalName = "error");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}