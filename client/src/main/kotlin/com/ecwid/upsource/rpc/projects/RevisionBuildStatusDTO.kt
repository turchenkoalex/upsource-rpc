// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param projectId Project ID in Upsource
 * @param revisionId VCS revision ID
 * @param keys A unique build identifier (e.g. PROJECT-VERSION-1234)
 */
@Suppress("unused")
data class RevisionBuildStatusDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * VCS revision ID (required)
	 */
	val revisionId: String,

	/**
	 * A unique build identifier (e.g. PROJECT-VERSION-1234) (repeated)
	 */
	val keys: List<RevisionBuildStatusKeyDTO> = emptyList()
) {
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		revisionId = "",
		keys = emptyList()
	)
}

