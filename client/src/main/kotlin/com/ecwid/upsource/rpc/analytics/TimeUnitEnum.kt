package com.ecwid.upsource.rpc.analytics

/**
 * undefined
 */
enum class TimeUnitEnum(val value: Byte) {
	HOUR(1),
	DAY(2),
	WEEK(3),
	MONTH(4),
	QUARTER(5),
	YEAR(6);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}