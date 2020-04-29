package com.ecwid.upsource.rpc.projects

data class UserRevisionsListRequestDTO(
	/**
	 * ID of the specified Upsource user (required)
	 */
	val userId: String,

	/**
	 * Number of revisions to return (required)
	 */
	val limit: Int,

	/**
	 * Search query (e.g. "branch: master") and/or part of the commit message (optional)
	 */
	val query: String?
)