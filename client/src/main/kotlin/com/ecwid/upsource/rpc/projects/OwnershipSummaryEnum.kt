package com.ecwid.upsource.rpc.projects

/**
 * Describes file ownership
 */
enum class OwnershipSummaryEnum(val value: Byte) {
	OK(1),
	ONE_MAJOR(2),
	ALL_MINOR(3);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}