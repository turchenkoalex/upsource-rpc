// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.users

/**
 * @param userId User ID to register as an alias of the currently logged-in user
 */
@Suppress("unused")
data class BindVcsUsernameRequestDTO(
	/**
	 * User ID to register as an alias of the currently logged-in user (required)
	 */
	val userId: String
) {
	@Suppress("unused")
	internal constructor() : this(
		userId = ""
	)
}

