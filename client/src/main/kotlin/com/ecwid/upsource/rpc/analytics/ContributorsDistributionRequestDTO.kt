package com.ecwid.upsource.rpc.analytics

data class ContributorsDistributionRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Name of the project module (optional)
	 */
	val module: String? = null,

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
	internal constructor() : this(
		projectId = "",
		module = null,
		fromTime = 0L,
		toTime = 0L,
		timePoints = emptyList()
	)
}
