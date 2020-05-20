package com.ecwid.upsource.rpc.projects

data class ReviewDeadlineRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * Review due date (Unix timestamp) (optional)
	 */
	val deadline: Long? = null
) {
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		deadline = null
	)
}
