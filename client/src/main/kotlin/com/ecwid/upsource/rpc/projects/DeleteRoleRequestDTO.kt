package com.ecwid.upsource.rpc.projects

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
)