package com.ecwid.upsource.rpc.users

data class UserInfoResponseDTO(
	/**
	 * See FullUserInfoDTO parameters (repeated)
	 */
	val infos: List<FullUserInfoDTO>
)