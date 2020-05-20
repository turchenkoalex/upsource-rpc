package com.ecwid.upsource.rpc.analytics

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
