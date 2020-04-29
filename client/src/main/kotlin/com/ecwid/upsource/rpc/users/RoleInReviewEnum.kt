package com.ecwid.upsource.rpc.users

/**
 * Describes roles in a review
 */
enum class RoleInReviewEnum(val value: Byte) {
	Author(1),
	Reviewer(2),
	Watcher(3);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}