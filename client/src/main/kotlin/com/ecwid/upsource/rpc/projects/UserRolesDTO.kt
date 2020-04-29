package com.ecwid.upsource.rpc.projects

data class UserRolesDTO(
	/**
	 * ID of the Upsource user (required)
	 */
	val userId: String,

	/**
	 * See RoleDTO parameters (repeated)
	 */
	val roles: List<RoleDTO>
)