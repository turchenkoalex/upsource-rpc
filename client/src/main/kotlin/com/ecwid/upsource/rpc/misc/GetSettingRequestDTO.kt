package com.ecwid.upsource.rpc.misc

data class GetSettingRequestDTO(
	/**
	 * Setting key (required)
	 */
	val key: String
)