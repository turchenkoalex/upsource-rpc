package com.ecwid.upsource.rpc.projects

data class ReviewSummaryChangesRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * IDs of the requested revisions (optional)
	 */
	val revisions: RevisionsSetDTO? = null
) {
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		revisions = null
	)
}
