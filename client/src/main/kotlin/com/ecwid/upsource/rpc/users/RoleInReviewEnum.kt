package com.ecwid.upsource.rpc.users

/**
 * Describes roles in a review
 */
enum class RoleInReviewEnum(val value: Byte, val originalName: String) {
	AUTHOR(value = 1, originalName = "Author"),
	REVIEWER(value = 2, originalName = "Reviewer"),
	WATCHER(value = 3, originalName = "Watcher");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
