package com.ecwid.upsource.rpc.misc

data class SetProjectSettingRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * See SetSettingRequestDTO parameters (required)
	 */
	val request: SetSettingRequestDTO
)