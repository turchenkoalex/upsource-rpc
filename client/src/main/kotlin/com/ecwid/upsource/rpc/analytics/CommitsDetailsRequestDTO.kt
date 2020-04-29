package com.ecwid.upsource.rpc.analytics

data class CommitsDetailsRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Unix timestamp (required)
	 */
	val fromTime: Long,

	/**
	 * Unix timestamp (required)
	 */
	val toTime: Long,

	/**
	 * User IDs of committers (repeated)
	 */
	val committers: List<String>,

	/**
	 * Name of the project module (optional)
	 */
	val module: String?
)