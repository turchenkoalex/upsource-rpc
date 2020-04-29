package com.ecwid.upsource.rpc.users

data class ProjectUserGroupsRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Search query, i.e. starting part of the name (optional)
	 */
	val query: String?,

	/**
	 * Maximum number of results to return (required)
	 */
	val limit: Int
)