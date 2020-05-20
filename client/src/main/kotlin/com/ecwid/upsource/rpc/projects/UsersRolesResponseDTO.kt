package com.ecwid.upsource.rpc.projects

data class UsersRolesResponseDTO(
	/**
	 * See UserRolesDTO parameters (repeated)
	 */
	val userRoles: List<UserRolesDTO> = emptyList(),

	/**
	 * Whether all available items have been returned or more can be requested by passing the corresponding 'limit' value in the subsequent request (required)
	 */
	val hasMore: Boolean
) {
	internal constructor() : this(
		userRoles = emptyList(),
		hasMore = false
	)
}
