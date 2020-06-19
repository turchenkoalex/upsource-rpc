// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.analytics

/**
 * @param projectId Project ID in Upsource
 * @param fromTime Unix timestamp
 * @param toTime Unix timestamp
 */
data class ResponsibilityDistributionRequestDTO(
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
	val toTime: Long
) {
	internal constructor() : this(
		projectId = "",
		fromTime = 0L,
		toTime = 0L
	)
}
