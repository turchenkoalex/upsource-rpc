// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.analytics

/**
 * @param projectId Project ID in Upsource
 * @param period See TimeUnitEnum parameters
 * @param referenceTime Unix timestamp used to calculate the distribution. This timestamp encapsulates the time set on the client and makes the server generate even days, months, etc. for the particular client.
 */
data class ReviewCoverageRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * See TimeUnitEnum parameters (required)
	 * 
	 * @see TimeUnitEnum
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
