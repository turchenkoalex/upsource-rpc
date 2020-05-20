package com.ecwid.upsource.rpc.projects

data class RevisionsDiffRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * ID of the base revision (required)
	 */
	val baseRevision: String,

	/**
	 * ID of the revision that should be compared to the base revision (required)
	 */
	val secondRevision: String
) {
	internal constructor() : this(
		projectId = "",
		baseRevision = "",
		secondRevision = ""
	)
}
