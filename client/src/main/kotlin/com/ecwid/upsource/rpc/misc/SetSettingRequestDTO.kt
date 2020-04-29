package com.ecwid.upsource.rpc.misc

data class SetSettingRequestDTO(
	/**
	 * Setting key (required)
	 */
	val key: String,

	/**
	 * Setting value (required)
	 */
	val value: String
)