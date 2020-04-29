package com.ecwid.upsource.rpc.projects

/**
 * Describes feed type
 */
enum class FeedTypeEnum(val value: Byte) {
	Feed(1),
	Review(2);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}