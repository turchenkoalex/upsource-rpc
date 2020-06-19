// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param pattern Search query, e.g. part of the name
 * @param limit Number of projects to return
 * @param isExact Whether to search for the exact match
 */
data class FindProjectsRequestDTO(
	/**
	 * Search query, e.g. part of the name (required)
	 */
	val pattern: String,

	/**
	 * Number of projects to return (required)
	 */
	val limit: Int,

	/**
	 * Whether to search for the exact match (optional)
	 */
	val isExact: Boolean? = null
) {
	internal constructor() : this(
		pattern = "",
		limit = 0,
		isExact = null
	)
}
