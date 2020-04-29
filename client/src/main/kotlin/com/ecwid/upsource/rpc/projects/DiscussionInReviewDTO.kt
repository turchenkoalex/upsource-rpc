package com.ecwid.upsource.rpc.projects

data class DiscussionInReviewDTO(
	/**
	 * ID of the discussion (required)
	 */
	val discussionId: String,

	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO
)