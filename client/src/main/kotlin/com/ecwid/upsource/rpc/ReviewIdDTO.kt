package com.ecwid.upsource.rpc

data class ReviewIdDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Review ID assigned to it when it's created (required)
	 */
	val reviewId: String
)