package com.ecwid.upsource.rpc.users

data class UsersPresenceInfoResponseDTO(
	/**
	 * See UserPresenceInfoDTO parameters (repeated)
	 */
	val presences: List<UserPresenceInfoDTO> = emptyList()
)