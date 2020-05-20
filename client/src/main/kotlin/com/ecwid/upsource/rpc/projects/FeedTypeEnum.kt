package com.ecwid.upsource.rpc.projects

/**
 * Describes feed type
 */
enum class FeedTypeEnum(val value: Byte, val originalName: String) {
	FEED(value = 1, originalName = "Feed"),
	REVIEW(value = 2, originalName = "Review");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
