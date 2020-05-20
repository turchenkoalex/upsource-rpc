package com.ecwid.upsource.rpc.projects

data class RevisionsInReviewDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * IDs of the revisions attached to the review (repeated)
	 */
	val revisionId: List<String> = emptyList()
) {
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		revisionId = emptyList()
	)
}
