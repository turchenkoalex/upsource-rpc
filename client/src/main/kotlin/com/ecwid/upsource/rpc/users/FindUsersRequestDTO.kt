package com.ecwid.upsource.rpc.users

data class FindUsersRequestDTO(
	/**
	 * Project ID in Upsource (optional)
	 */
	val projectId: String?,

	/**
	 * Search query, e.g. part of the name (required)
	 */
	val pattern: String,

	/**
	 * Number of results to return (required)
	 */
	val limit: Int
)