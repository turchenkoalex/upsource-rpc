package com.ecwid.upsource.rpc.analytics

data class UserActivityRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * User activity period. See TimeUnitEnum parameters (required)
	 */
	val period: TimeUnitEnum,

	/**
	 * Unix timestamp used to calculate the distribution. This timestamp encapsulates the time set on the client and makes the server generate even days, months, etc. for the particular client. (required)
	 */
	val referenceTime: Long,

	/**
	 * User IDs of committers (repeated)
	 */
	val committers: List<String>
)