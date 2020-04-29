package com.ecwid.upsource.rpc.projects

/**
 * Describes project status
 */
enum class ProjectStateEnum(val value: Byte) {
	NotStarted(1),
	Initializing(2),
	Success(3),
	Failure(4);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}