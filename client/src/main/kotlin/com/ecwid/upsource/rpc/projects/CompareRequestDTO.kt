package com.ecwid.upsource.rpc.projects

data class CompareRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Name of a branch or a revision ID to be used in a comparison (required)
	 */
	val leftLocator: String,

	/**
	 * Name of a branch or a revision ID to be used in a comparison (required)
	 */
	val rightLocator: String
) {
	internal constructor() : this(
		projectId = "",
		leftLocator = "",
		rightLocator = ""
	)
}
