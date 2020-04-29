package com.ecwid.upsource.rpc.projects

data class RevisionListDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * IDs of the requested revisions (repeated)
	 */
	val revisionId: List<String>
)