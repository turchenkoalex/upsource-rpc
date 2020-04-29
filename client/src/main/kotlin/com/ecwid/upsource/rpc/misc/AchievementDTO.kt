package com.ecwid.upsource.rpc.misc

data class AchievementDTO(
	/**
	 * Achievement ID (required)
	 */
	val id: String,

	/**
	 * Achievement title (required)
	 */
	val name: String,

	/**
	 * Short description of the achievement (required)
	 */
	val shortDescription: String,

	/**
	 * Longer description of the achievement (optional)
	 */
	val description: String?,

	/**
	 * Unix timestamp of the unlocking event (optional)
	 */
	val date: Long?,

	/**
	 * Whether the user saw a notification about the unlocking (optional)
	 */
	val isUnread: Boolean?,

	/**
	 * Whether the achievement is unlocked by the user (optional)
	 */
	val isUnlocked: Boolean?
)