package com.ecwid.upsource.rpc.users

data class UserInfoRequestDTO(
	/**
	 * A list of user IDs to request the full user info for (repeated)
	 */
	val ids: List<String>
)