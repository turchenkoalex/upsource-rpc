package com.ecwid.upsource.rpc.projects

data class ReviewSuggestDTO(
	/**
	 * See ShortReviewInfoDTO parameter (optional)
	 */
	val reviewInfo: ShortReviewInfoDTO?,

	/**
	 * The confidence score (optional)
	 */
	val score: Float?
)