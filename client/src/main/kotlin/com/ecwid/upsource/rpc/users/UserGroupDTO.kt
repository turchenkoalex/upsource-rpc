// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.users

/**
 * @param id Group ID
 * @param name Group name
 * @param usersCount Number of users participating in this group
 */
@Suppress("unused")
data class UserGroupDTO(
	/**
	 * Group ID (required)
	 */
	val id: String,

	/**
	 * Group name (required)
	 */
	val name: String,

	/**
	 * Number of users participating in this group (required)
	 */
	val usersCount: Int
) {
	@Suppress("unused")
	internal constructor() : this(
		id = "",
		name = "",
		usersCount = 0
	)
}

