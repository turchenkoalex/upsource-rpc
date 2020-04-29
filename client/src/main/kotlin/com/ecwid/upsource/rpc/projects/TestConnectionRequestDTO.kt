package com.ecwid.upsource.rpc.projects

data class TestConnectionRequestDTO(
	/**
	 * Project ID (optional)
	 */
	val projectId: String?,

	/**
	 * VCS configuration represented as a JSON-encoded string (required)
	 */
	val vcsSettings: String
)