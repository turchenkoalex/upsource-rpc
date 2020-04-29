package com.ecwid.upsource.rpc.projects

data class RoleDetailsDTO(
	/**
	 * Role ID (required)
	 */
	val id: String,

	/**
	 * Role key (e.g. project-admin) (required)
	 */
	val key: String,

	/**
	 * Role name (e.g. Project admin) (required)
	 */
	val name: String,

	/**
	 * Role description (optional)
	 */
	val description: String?
)