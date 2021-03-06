// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.users

/**
 * @param userId Upsource user ID
 * @param name Upsource user name
 * @param isResolved Whether the user has an account in Hub
 * @param isMe Flags the currently logged-in user
 * @param isOnline Whether the user is online
 * @param avatarUrl URL of the userpic
 * @param profileUrl URL of the Hub user profile
 * @param email Email address
 * @param login Login
 * @param absentUntil Absence end date, if the user is currently on leave
 */
@Suppress("unused")
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
	val isOnline: Boolean? = null,

	/**
	 * URL of the userpic (optional)
	 */
	val avatarUrl: String? = null,

	/**
	 * URL of the Hub user profile (optional)
	 */
	val profileUrl: String? = null,

	/**
	 * Email address (optional)
	 */
	val email: String? = null,

	/**
	 * Login (optional)
	 */
	val login: String? = null,

	/**
	 * Absence end date, if the user is currently on leave (optional)
	 */
	val absentUntil: Long? = null
) {
	@Suppress("unused")
	internal constructor() : this(
		userId = "",
		name = "",
		isResolved = false,
		isMe = false,
		isOnline = null,
		avatarUrl = null,
		profileUrl = null,
		email = null,
		login = null,
		absentUntil = null
	)
}

