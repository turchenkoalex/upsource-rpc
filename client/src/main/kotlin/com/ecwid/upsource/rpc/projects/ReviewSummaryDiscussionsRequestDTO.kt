package com.ecwid.upsource.rpc.projects

data class ReviewSummaryDiscussionsRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO,

	/**
	 * See RevisionsSetDTO parameters (optional)
	 */
	val revisions: RevisionsSetDTO?
)