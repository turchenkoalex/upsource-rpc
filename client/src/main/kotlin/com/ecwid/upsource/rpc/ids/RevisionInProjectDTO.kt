package com.ecwid.upsource.rpc.ids

data class RevisionInProjectDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * VCS revision ID (required)
	 */
	val revisionId: String
) {
	internal constructor() : this(
		projectId = "",
		revisionId = ""
	)
}
