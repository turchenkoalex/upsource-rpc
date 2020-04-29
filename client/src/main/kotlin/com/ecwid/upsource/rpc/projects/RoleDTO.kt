package com.ecwid.upsource.rpc.projects

data class RoleDTO(
	/**
	 * Role key (e.g. project-admin) (required)
	 */
	val key: String,

	/**
	 * Whether the role is a global one in Hub (required)
	 */
	val isGlobal: Boolean,

	/**
	 * Whether the role is assigned to a group (required)
	 */
	val isGroup: Boolean
)