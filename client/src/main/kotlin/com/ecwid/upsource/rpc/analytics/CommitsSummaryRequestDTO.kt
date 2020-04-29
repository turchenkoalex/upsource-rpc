package com.ecwid.upsource.rpc.analytics

data class CommitsSummaryRequestDTO(
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
	val committers: List<String>
)