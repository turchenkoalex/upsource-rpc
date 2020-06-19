// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param projectId ID of the Upsource project
 * @param userId ID of the Upsource user
 * @param roleKey Role key
 */
data class DeleteRoleRequestDTO(
	/**
	 * ID of the Upsource project (required)
	 */
	val projectId: String,

	/**
	 * ID of the Upsource user (required)
	 */
	val userId: String,

	/**
	 * Role key (required)
	 */
	val roleKey: String
) {
	internal constructor() : this(
		projectId = "",
		userId = "",
		roleKey = ""
	)
}
