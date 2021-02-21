// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param projectId Project ID in Upsource
 * @param revisionId VCS revision ID
 * @param files Files that contain differing inspections
 */
@Suppress("unused")
data class RevisionExternalInspectionsDiffResponseDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * VCS revision ID (required)
	 */
	val revisionId: String,

	/**
	 * Files that contain differing inspections (repeated)
	 */
	val files: List<FileExternalInspectionsDiffResponseDTO> = emptyList()
) {
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		revisionId = "",
		files = emptyList()
	)
}

