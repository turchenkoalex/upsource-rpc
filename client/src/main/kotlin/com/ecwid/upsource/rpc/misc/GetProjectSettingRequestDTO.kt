package com.ecwid.upsource.rpc.misc

data class GetProjectSettingRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * See GetSettingRequestDTO parameters (required)
	 */
	val request: GetSettingRequestDTO
)