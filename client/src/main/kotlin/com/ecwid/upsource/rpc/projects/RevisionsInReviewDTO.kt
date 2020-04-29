package com.ecwid.upsource.rpc.projects

data class RevisionsInReviewDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO,

	/**
	 * IDs of the revisions attached to the review (repeated)
	 */
	val revisionId: List<String>
)