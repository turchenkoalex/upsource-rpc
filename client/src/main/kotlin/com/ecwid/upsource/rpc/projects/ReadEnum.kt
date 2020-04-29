package com.ecwid.upsource.rpc.projects

/**
 * Describes read status of a feed item
 */
enum class ReadEnum(val value: Byte) {
	Read(1),
	Unread(2),
	ManuallyUnread(3);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}