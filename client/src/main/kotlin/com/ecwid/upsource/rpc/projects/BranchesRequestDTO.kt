package com.ecwid.upsource.rpc.projects

data class BranchesRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Search query (required)
	 */
	val query: String,

	/**
	 * Number of branches to return (required)
	 */
	val limit: Int,

	/**
	 * Sort by: last updated ("updated", default), branch name ("name") (optional)
	 */
	val sortBy: String?
)