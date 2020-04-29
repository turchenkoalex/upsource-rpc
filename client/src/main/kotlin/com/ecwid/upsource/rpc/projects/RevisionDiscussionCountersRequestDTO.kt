package com.ecwid.upsource.rpc.projects

data class RevisionDiscussionCountersRequestDTO(
	/**
	 * See RevisionListDTO parameters (required)
	 */
	val revisions: RevisionListDTO,

	/**
	 * Additional revisions filter (optional)
	 */
	val fileNameFilter: String?
)