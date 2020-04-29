package com.ecwid.upsource.rpc.projects

data class ShortReviewInfoDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO,

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
	val branch: List<String>,

	/**
	 * See CompletionRateDTO parameters (optional)
	 */
	val completionRate: CompletionRateDTO?,

	/**
	 * Review labels (repeated)
	 */
	val labels: List<LabelDTO>
)