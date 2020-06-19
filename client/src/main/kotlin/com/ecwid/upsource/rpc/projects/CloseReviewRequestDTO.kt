// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param reviewId See ReviewIdDTO parameters
 * @param isFlagged Pass 'true' to close a review, 'false' to reopen a closed review
 */
data class CloseReviewRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 * 
	 * @see ReviewIdDTO
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * Pass 'true' to close a review, 'false' to reopen a closed review (required)
	 */
	val isFlagged: Boolean
) {
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		isFlagged = false
	)
}
