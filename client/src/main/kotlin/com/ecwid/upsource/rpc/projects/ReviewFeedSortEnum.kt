package com.ecwid.upsource.rpc.projects

/**
 * Describes review feed sorting criteria
 */
enum class ReviewFeedSortEnum(val value: Byte, val originalName: String) {
	NATURAL(value = 1, originalName = "Natural"),
	LAST_UPDATED(value = 2, originalName = "LastUpdated");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
