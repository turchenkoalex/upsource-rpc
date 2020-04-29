package com.ecwid.upsource.rpc.analytics

data class ReviewersGraphRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Unix timestamp, only reviews that were updated later are considered (optional)
	 */
	val fromTime: Long?
)