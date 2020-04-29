package com.ecwid.upsource.rpc.projects

data class ReviewDeadlineRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO,

	/**
	 * Review due date (Unix timestamp) (optional)
	 */
	val deadline: Long?
)