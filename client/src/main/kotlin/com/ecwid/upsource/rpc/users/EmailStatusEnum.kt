package com.ecwid.upsource.rpc.users

/**
 * Describes status of an email address
 */
enum class EmailStatusEnum(val value: Byte) {
	OK(1),
	NotVerified(2),
	NotSpecified(3),
	HardBounce(4);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}