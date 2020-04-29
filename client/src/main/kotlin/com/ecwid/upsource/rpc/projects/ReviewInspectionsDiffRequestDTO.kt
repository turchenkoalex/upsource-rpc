package com.ecwid.upsource.rpc.projects

data class ReviewInspectionsDiffRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO,

	/**
	 * IDs of the requested revisions (optional)
	 */
	val revisions: RevisionsSetDTO?
)