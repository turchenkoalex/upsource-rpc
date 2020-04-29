package com.ecwid.upsource.rpc.analytics

/**
 * undefined
 */
enum class ReviewCoverageStateEnum(val value: Byte) {
	CLOSED(1),
	OPEN(2),
	ALL(3);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}