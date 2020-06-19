// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param projectId ID of the Upsource project
 * @param email Email address of the Upsource user
 */
data class InviteUserRequestDTO(
	/**
	 * ID of the Upsource project (required)
	 */
	val projectId: String,

	/**
	 * Email address of the Upsource user (required)
	 */
	val email: String
) {
	internal constructor() : this(
		projectId = "",
		email = ""
	)
}
