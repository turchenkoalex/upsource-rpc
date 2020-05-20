package com.ecwid.upsource.rpc.ids

data class ReviewIdDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Review ID assigned to it when it's created (required)
	 */
	val reviewId: String
) {
	internal constructor() : this(
		projectId = "",
		reviewId = ""
	)
}
