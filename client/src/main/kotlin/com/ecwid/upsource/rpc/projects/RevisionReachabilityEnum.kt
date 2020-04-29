package com.ecwid.upsource.rpc.projects

/**
 * undefined
 */
enum class RevisionReachabilityEnum(val value: Byte) {
	Reachable(1),
	Unknown(2),
	NotReachable(3);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}