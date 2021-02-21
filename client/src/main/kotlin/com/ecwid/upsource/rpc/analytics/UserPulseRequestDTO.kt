// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.analytics

/**
 * @param userId Upsource user ID
 * @param fromTime Unix timestamp
 * @param toTime Unix timestamp
 * @param timePoints The specific time intervals that define the distribution (Unix timestamps)
 */
@Suppress("unused")
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
	val timePoints: List<Long> = emptyList()
) {
	@Suppress("unused")
	internal constructor() : this(
		userId = "",
		fromTime = 0L,
		toTime = 0L,
		timePoints = emptyList()
	)
}

