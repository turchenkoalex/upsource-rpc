package com.ecwid.upsource.rpc.projects

data class ToggleReviewMutedRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO,

	/**
	 * Whether to mute or to unmute (required)
	 */
	val doMute: Boolean
)