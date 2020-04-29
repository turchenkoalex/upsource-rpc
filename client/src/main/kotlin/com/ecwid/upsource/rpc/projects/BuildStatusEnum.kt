package com.ecwid.upsource.rpc.projects

/**
 * Describes build status
 */
enum class BuildStatusEnum(val value: Byte) {
	Success(1),
	Failed(2),
	InProgress(3);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}