package com.ecwid.upsource.rpc.projects

/**
 * Describes participant status
 */
enum class ParticipantStateEnum(val value: Byte) {
	Unread(1),
	Read(2),
	Accepted(3),
	Rejected(4);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}