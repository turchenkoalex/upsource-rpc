package com.ecwid.upsource.rpc.projects

/**
 * Describes file-level diff type
 */
enum class DiffTypeEnum(val value: Byte) {
	Added(1),
	Removed(2),
	Modified(3),
	Commented(4);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}