package com.ecwid.upsource.rpc.projects

data class TestConnectionRequestDTO(
	/**
	 * Project ID (optional)
	 */
	val projectId: String? = null,

	/**
	 * VCS configuration represented as a JSON-encoded string (required)
	 */
	val vcsSettings: String
) {
	internal constructor() : this(
		projectId = null,
		vcsSettings = ""
	)
}
