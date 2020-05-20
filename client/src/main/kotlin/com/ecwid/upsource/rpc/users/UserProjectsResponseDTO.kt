package com.ecwid.upsource.rpc.users

data class UserProjectsResponseDTO(
	/**
	 * See UserProjectInfoDTO parameters (repeated)
	 */
	val projects: List<UserProjectInfoDTO> = emptyList()
)