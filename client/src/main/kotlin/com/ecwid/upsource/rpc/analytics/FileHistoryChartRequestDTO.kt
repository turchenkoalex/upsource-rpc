// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.analytics

/**
 * @param projectId Project ID in Upsource
 * @param framesCount Number of frames
 */
data class FileHistoryChartRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Number of frames (optional)
	 */
	val framesCount: Int? = null
) {
	internal constructor() : this(
		projectId = "",
		framesCount = null
	)
}
