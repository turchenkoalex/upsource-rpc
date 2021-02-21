// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param key Role key (e.g. project-admin)
 * @param isGlobal Whether the role is a global one in Hub
 * @param isGroup Whether the role is assigned to a group
 */
@Suppress("unused")
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
) {
	@Suppress("unused")
	internal constructor() : this(
		key = "",
		isGlobal = false,
		isGroup = false
	)
}

