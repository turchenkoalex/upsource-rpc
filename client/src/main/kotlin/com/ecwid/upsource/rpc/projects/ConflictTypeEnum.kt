package com.ecwid.upsource.rpc.projects

/**
 * Describes merge conflict type
 */
enum class ConflictTypeEnum(val value: Byte) {
	NO_CONFLICT(1),
	CAN_BE_RESOLVED(2),
	CAN_NOT_BE_RESOLVED(3);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}