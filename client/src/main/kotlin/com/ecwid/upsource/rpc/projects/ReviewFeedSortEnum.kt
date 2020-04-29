package com.ecwid.upsource.rpc.projects

/**
 * Describes review feed sorting criteria
 */
enum class ReviewFeedSortEnum(val value: Byte) {
	Natural(1),
	LastUpdated(2);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}