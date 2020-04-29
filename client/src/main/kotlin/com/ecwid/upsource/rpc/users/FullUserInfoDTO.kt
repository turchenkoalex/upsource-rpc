package com.ecwid.upsource.rpc.users

data class FullUserInfoDTO(
	/**
	 * Upsource user ID (required)
	 */
	val userId: String,

	/**
	 * Upsource user name (required)
	 */
	val name: String,

	/**
	 * Whether the user has an account in Hub (required)
	 */
	val isResolved: Boolean,

	/**
	 * Flags the currently logged-in user (required)
	 */
	val isMe: Boolean,

	/**
	 * Whether the user is online (optional)
	 */
	val isOnline: Boolean?,

	/**
	 * URL of the userpic (optional)
	 */
	val avatarUrl: String?,

	/**
	 * URL of the Hub user profile (optional)
	 */
	val profileUrl: String?,

	/**
	 * Email address (optional)
	 */
	val email: String?,

	/**
	 * Login (optional)
	 */
	val login: String?,

	/**
	 * Absence end date, if the user is currently on leave (optional)
	 */
	val absentUntil: Long?
)