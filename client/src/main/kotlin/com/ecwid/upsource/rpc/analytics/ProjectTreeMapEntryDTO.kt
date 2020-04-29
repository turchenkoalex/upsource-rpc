package com.ecwid.upsource.rpc.analytics

data class ProjectTreeMapEntryDTO(
	/**
	 * File path (required)
	 */
	val path: String,

	/**
	 * File size (required)
	 */
	val size: Int,

	/**
	 * Number of modifications (required)
	 */
	val modificationsCount: Int,

	/**
	 * Whether a file is binary (required)
	 */
	val isBinary: Boolean,

	/**
	 * Time elapsed since last change (milliseconds) (required)
	 */
	val timeSinceLastChange: Long
)