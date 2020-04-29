package com.ecwid.upsource.rpc.projects

/**
 * Describes revision status
 */
enum class RevisionStateEnum(val value: Byte) {
	None(1),
	Found(2),
	Imported(3);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}