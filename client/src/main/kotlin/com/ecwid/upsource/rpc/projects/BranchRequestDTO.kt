// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param projectId Project ID in Upsource
 * @param branch Branch name
 */
@Suppress("unused")
data class BranchRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Branch name (required)
	 */
	val branch: String
) {
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		branch = ""
	)
}

