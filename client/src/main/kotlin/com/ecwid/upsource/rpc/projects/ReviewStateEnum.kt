package com.ecwid.upsource.rpc.projects

/**
 * Describes review state
 */
enum class ReviewStateEnum(val value: Byte) {
	Open(1),
	Closed(2);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}