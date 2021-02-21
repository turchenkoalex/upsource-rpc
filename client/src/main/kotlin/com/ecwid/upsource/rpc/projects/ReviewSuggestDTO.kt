// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param reviewInfo See ShortReviewInfoDTO parameter
 * @param score The confidence score
 */
data class ReviewSuggestDTO(
	/**
	 * See ShortReviewInfoDTO parameter (optional)
	 * 
	 * @see com.ecwid.upsource.rpc.projects.ShortReviewInfoDTO
	 */
	val reviewInfo: ShortReviewInfoDTO? = null,

	/**
	 * The confidence score (optional)
	 */
	val score: Double? = null
)