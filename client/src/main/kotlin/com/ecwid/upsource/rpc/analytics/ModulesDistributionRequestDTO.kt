package com.ecwid.upsource.rpc.analytics

data class ModulesDistributionRequestDTO(
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
	val committers: List<String> = emptyList(),

	/**
	 * The specific time intervals that define the distribution (Unix timestamps) (repeated)
	 */
	val timePoints: List<Long> = emptyList()
) {
	internal constructor() : this(
		projectId = "",
		fromTime = 0L,
		toTime = 0L,
		committers = emptyList(),
		timePoints = emptyList()
	)
}
