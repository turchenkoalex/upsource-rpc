package com.ecwid.upsource.rpc.analytics

data class UserPulseRequestDTO(
	/**
	 * Upsource user ID (required)
	 */
	val userId: String,

	/**
	 * Unix timestamp (required)
	 */
	val fromTime: Long,

	/**
	 * Unix timestamp (required)
	 */
	val toTime: Long,

	/**
	 * The specific time intervals that define the distribution (Unix timestamps) (repeated)
	 */
	val timePoints: List<Long>
)