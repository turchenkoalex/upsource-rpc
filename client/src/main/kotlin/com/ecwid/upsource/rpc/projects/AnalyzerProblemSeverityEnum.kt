package com.ecwid.upsource.rpc.projects

/**
 * Describes analyzer problem severity
 */
enum class AnalyzerProblemSeverityEnum(val value: Byte) {
	Info(1),
	Warning(2),
	Error(3);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}