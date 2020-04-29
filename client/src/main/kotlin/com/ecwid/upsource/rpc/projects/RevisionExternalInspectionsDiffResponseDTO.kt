package com.ecwid.upsource.rpc.projects

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
	val files: List<FileExternalInspectionsDiffResponseDTO>
)