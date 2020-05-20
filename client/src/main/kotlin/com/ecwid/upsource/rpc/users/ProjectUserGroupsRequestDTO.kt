package com.ecwid.upsource.rpc.users

data class ProjectUserGroupsRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Search query, i.e. starting part of the name (optional)
	 */
	val query: String? = null,

	/**
	 * Maximum number of results to return (required)
	 */
	val limit: Int
) {
	internal constructor() : this(
		projectId = "",
		query = null,
		limit = 0
	)
}
