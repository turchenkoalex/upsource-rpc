// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param projectId Project ID in Upsource
 * @param query A query string
 * @param limit Number of discussions to return
 * @param skip Number of discussions to skip from the top (for pagination)
 */
data class DiscussionsInProjectRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * A query string (required)
	 */
	val query: String,

	/**
	 * Number of discussions to return (required)
	 */
	val limit: Int,

	/**
	 * Number of discussions to skip from the top (for pagination) (optional)
	 */
	val skip: Int? = null
) {
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		query = "",
		limit = 0,
		skip = null
	)
}
