// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param userId ID of the specified Upsource user
 * @param limit Number of revisions to return
 * @param query Search query (e.g. "branch: master") and/or part of the commit message
 */
@Suppress("unused")
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
	val query: String? = null
) {
	@Suppress("unused")
	internal constructor() : this(
		userId = "",
		limit = 0,
		query = null
	)
}

