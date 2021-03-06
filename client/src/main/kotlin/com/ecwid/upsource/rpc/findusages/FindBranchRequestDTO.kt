// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.findusages

/**
 * @param projectId Project ID in Upsource
 * @param pattern Search query, e.g. part of the branch name
 * @param limit Max number of results to return
 */
@Suppress("unused")
data class FindBranchRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Search query, e.g. part of the branch name (required)
	 */
	val pattern: String,

	/**
	 * Max number of results to return (required)
	 */
	val limit: Int
) {
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		pattern = "",
		limit = 0
	)
}

