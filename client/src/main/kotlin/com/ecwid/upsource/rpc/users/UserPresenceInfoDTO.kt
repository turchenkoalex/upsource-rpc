package com.ecwid.upsource.rpc.users

data class UserPresenceInfoDTO(
	/**
	 * Upsource user ID (required)
	 */
	val userId: String,

	/**
	 * Whether the user is online (required)
	 */
	val isOnline: Boolean,

	/**
	 * Absence end date, if the user is currently on leave (optional)
	 */
	val absentUntil: Long?
)