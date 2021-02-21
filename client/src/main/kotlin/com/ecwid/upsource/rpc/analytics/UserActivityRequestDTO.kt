// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.analytics

/**
 * @param projectId Project ID in Upsource
 * @param period User activity period. See TimeUnitEnum parameters
 * @param referenceTime Unix timestamp used to calculate the distribution. This timestamp encapsulates the time set on the client and makes the server generate even days, months, etc. for the particular client.
 * @param committers User IDs of committers
 */
data class UserActivityRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * User activity period. See TimeUnitEnum parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.analytics.TimeUnitEnum
	 */
	val period: TimeUnitEnum,

	/**
	 * Unix timestamp used to calculate the distribution. This timestamp encapsulates the time set on the client and makes the server generate even days, months, etc. for the particular client. (required)
	 */
	val referenceTime: Long,

	/**
	 * User IDs of committers (repeated)
	 */
	val committers: List<String> = emptyList()
) {
	internal constructor() : this(
		projectId = "",
		period = TimeUnitEnum.HOUR,
		referenceTime = 0L,
		committers = emptyList()
	)
}
