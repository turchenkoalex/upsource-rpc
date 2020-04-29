package com.ecwid.upsource.rpc.projects

data class CodeReviewPattern(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Code review ID pattern (required)
	 */
	val pattern: String
)