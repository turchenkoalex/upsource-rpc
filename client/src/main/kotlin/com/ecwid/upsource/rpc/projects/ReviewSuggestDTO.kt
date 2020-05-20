package com.ecwid.upsource.rpc.projects

data class ReviewSuggestDTO(
	/**
	 * See ShortReviewInfoDTO parameter (optional)
	 */
	val reviewInfo: ShortReviewInfoDTO? = null,

	/**
	 * The confidence score (optional)
	 */
	val score: Double? = null
)