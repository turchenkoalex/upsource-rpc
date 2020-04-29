package com.ecwid.upsource.rpc.projects

data class CloseReviewRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO,

	/**
	 * Pass 'true' to close a review, 'false' to reopen a closed review (required)
	 */
	val isFlagged: Boolean
)