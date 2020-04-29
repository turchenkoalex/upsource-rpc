package com.ecwid.upsource.rpc.projects

/**
 * Describes status of a remote connection
 */
enum class TestConnectionStatusEnum(val value: Byte) {
	Success(1),
	Failure(2),
	Timeout(3);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}