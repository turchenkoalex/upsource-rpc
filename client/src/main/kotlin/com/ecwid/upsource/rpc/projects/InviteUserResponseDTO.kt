package com.ecwid.upsource.rpc.projects

data class InviteUserResponseDTO(
	/**
	 * See UserRolesDTO parameters (optional)
	 */
	val user: UserRolesDTO?,

	/**
	 * Whether the user is already invited (required)
	 */
	val isInvited: Boolean
)