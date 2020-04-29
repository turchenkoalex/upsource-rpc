package com.ecwid.upsource.rpc.analytics

data class ReviewStatisticsRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Unix timestamp (optional)
	 */
	val fromTime: Long?,

	/**
	 * Unix timestamp (optional)
	 */
	val toTime: Long?
)