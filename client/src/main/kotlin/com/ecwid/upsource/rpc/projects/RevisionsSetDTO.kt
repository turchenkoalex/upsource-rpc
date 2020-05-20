package com.ecwid.upsource.rpc.projects

data class RevisionsSetDTO(
	/**
	 * IDs of the requested revisions (repeated)
	 */
	val revisions: List<String> = emptyList(),

	/**
	 * Set this to "true" to request all revisions without enumerating them (optional)
	 */
	val selectAll: Boolean? = null
)