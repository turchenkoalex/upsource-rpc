package com.ecwid.upsource.rpc.projects

data class AllRolesResponseDTO(
	/**
	 * See RoleDetailsDTO parameters (repeated)
	 */
	val roleDetails: List<RoleDetailsDTO>
)