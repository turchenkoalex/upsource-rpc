package com.ecwid.upsource.rpc.projects

data class RenameReviewRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO,

	/**
	 * New review title (required)
	 */
	val text: String
)