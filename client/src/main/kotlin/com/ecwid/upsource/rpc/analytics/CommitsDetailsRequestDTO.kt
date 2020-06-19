// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.analytics

/**
 * @param projectId Project ID in Upsource
 * @param fromTime Unix timestamp
 * @param toTime Unix timestamp
 * @param committers User IDs of committers
 * @param module Name of the project module
 */
data class CommitsDetailsRequestDTO(
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
	 * Name of the project module (optional)
	 */
	val module: String? = null
) {
	internal constructor() : this(
		projectId = "",
		fromTime = 0L,
		toTime = 0L,
		committers = emptyList(),
		module = null
	)
}
