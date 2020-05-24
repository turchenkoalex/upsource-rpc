package com.ecwid.upsource.rpc.events

/**
 * Review state
 */
enum class ReviewState(val value: Byte, val originalName: String) {
	OPEN(value = 0, originalName = "Open"),
	CLOSED(value = 1, originalName = "Closed");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}