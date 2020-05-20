package com.ecwid.upsource.rpc.analytics

data class ReviewCoverageRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * See TimeUnitEnum parameters (required)
	 */
	val period: TimeUnitEnum,

	/**
	 * Unix timestamp used to calculate the distribution. This timestamp encapsulates the time set on the client and makes the server generate even days, months, etc. for the particular client. (required)
	 */
	val referenceTime: Long
) {
	internal constructor() : this(
		projectId = "",
		period = TimeUnitEnum.HOUR,
		referenceTime = 0L
	)
}
