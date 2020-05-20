package com.ecwid.upsource.rpc.users

data class FindUsersRequestDTO(
	/**
	 * Project ID in Upsource (optional)
	 */
	val projectId: String? = null,

	/**
	 * Search query, e.g. part of the name (required)
	 */
	val pattern: String,

	/**
	 * Number of results to return (required)
	 */
	val limit: Int
) {
	internal constructor() : this(
		projectId = null,
		pattern = "",
		limit = 0
	)
}
