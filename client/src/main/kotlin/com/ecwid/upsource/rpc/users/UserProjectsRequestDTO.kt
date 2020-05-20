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
) {
	internal constructor() : this(
		userId = "",
		commitTimestampFilter = 0L
	)
}
