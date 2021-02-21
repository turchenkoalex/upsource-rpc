// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param reviewId See ReviewIdDTO parameters
 * @param text Review description (Markdown is supported)
 */
data class EditReviewDescriptionRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.ids.ReviewIdDTO
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * Review description (Markdown is supported) (required)
	 */
	val text: String
) {
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		text = ""
	)
}
