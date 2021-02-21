// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.analytics

/**
 * @param projectId Project ID in Upsource
 * @param revisionId Revision ID
 */
data class ProjectTreeMapRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Revision ID (required)
	 */
	val revisionId: String
) {
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		revisionId = ""
	)
}
