package com.ecwid.upsource.rpc.projects

/**
 * Describes merge conflict type
 */
enum class ConflictTypeEnum(val value: Byte, val originalName: String) {
	NO_CONFLICT(value = 1, originalName = "NO_CONFLICT"),
	CAN_BE_RESOLVED(value = 2, originalName = "CAN_BE_RESOLVED"),
	CAN_NOT_BE_RESOLVED(value = 3, originalName = "CAN_NOT_BE_RESOLVED");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
