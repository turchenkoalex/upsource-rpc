package com.ecwid.upsource.rpc.users

data class UserProjectsRequestDTO(
	/**
	 * Upsource user ID (required)
	 */
	val userId: String,

	/**
	 * Project update timestamp to limit the returned projects by (required)
	 */
	val commitTimestampFilter: Long
)