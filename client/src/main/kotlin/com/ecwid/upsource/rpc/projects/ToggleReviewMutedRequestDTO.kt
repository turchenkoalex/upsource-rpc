// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param reviewId See ReviewIdDTO parameters
 * @param doMute Whether to mute or to unmute
 */
@Suppress("unused")
data class ToggleReviewMutedRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.ids.ReviewIdDTO
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * Whether to mute or to unmute (required)
	 */
	val doMute: Boolean
) {
	@Suppress("unused")
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		doMute = false
	)
}

