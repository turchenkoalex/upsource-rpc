package com.ecwid.upsource.rpc.files

/**
 * Describes severity of an inspection result
 */
enum class InspectionSeverityEnum(val value: Byte) {
	information(1),
	weak_warning(2),
	warning(3),
	error(4);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}