package com.ecwid.upsource.rpc.projects

data class EditReviewDescriptionRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO,

	/**
	 * Review description (Markdown is supported) (required)
	 */
	val text: String
)