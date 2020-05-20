package com.ecwid.upsource.rpc.projects

data class ShortReviewInfoDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * Review title (required)
	 */
	val title: String,

	/**
	 * Review state: open(1), closed(2) (required)
	 */
	val state: ReviewStateEnum,

	/**
	 * Names of tracked branches (repeated)
	 */
	val branch: List<String> = emptyList(),

	/**
	 * See CompletionRateDTO parameters (optional)
	 */
	val completionRate: CompletionRateDTO? = null,

	/**
	 * Review labels (repeated)
	 */
	val labels: List<LabelDTO> = emptyList()
) {
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		title = "",
		state = ReviewStateEnum.OPEN,
		branch = emptyList(),
		completionRate = null,
		labels = emptyList()
	)
}
