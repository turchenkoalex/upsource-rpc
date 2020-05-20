package com.ecwid.upsource.rpc.projects

/**
 * Describes review state
 */
enum class ReviewStateEnum(val value: Byte, val originalName: String) {
	OPEN(value = 1, originalName = "Open"),
	CLOSED(value = 2, originalName = "Closed");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
