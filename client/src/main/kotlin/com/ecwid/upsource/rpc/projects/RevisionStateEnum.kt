package com.ecwid.upsource.rpc.projects

/**
 * Describes revision status
 */
enum class RevisionStateEnum(val value: Byte, val originalName: String) {
	NONE(value = 1, originalName = "None"),
	FOUND(value = 2, originalName = "Found"),
	IMPORTED(value = 3, originalName = "Imported");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
