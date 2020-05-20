package com.ecwid.upsource.rpc.projects

/**
 * Describes analyzer problem severity
 */
enum class AnalyzerProblemSeverityEnum(val value: Byte, val originalName: String) {
	INFO(value = 1, originalName = "Info"),
	WARNING(value = 2, originalName = "Warning"),
	ERROR(value = 3, originalName = "Error");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
