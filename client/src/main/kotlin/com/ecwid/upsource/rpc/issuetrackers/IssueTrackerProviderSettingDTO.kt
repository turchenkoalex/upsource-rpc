package com.ecwid.upsource.rpc.issuetrackers

data class IssueTrackerProviderSettingDTO(
	/**
	 * Setting key (required)
	 */
	val name: String,

	/**
	 * Setting value (required)
	 */
	val value: String
)