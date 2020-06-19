// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.users

/**
 * @param projectId Project ID in Upsource
 * @param query Search query, i.e. starting part of the name
 * @param limit Maximum number of results to return
 */
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
