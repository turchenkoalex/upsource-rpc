// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param projectId Project ID in Upsource
 * @param limit Number of revisions to return
 * @param hash Current head revision ID
 * @param messageSubstring Additional filter by message (applied as AND)
 */
@Suppress("unused")
data class RevisionsListUpdateRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Number of revisions to return (required)
	 */
	val limit: Int,

	/**
	 * Current head revision ID (optional)
	 */
	val hash: String? = null,

	/**
	 * Additional filter by message (applied as AND) (repeated)
	 */
	val messageSubstring: List<String> = emptyList()
) {
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		limit = 0,
		hash = null,
		messageSubstring = emptyList()
	)
}

