package com.ecwid.upsource.rpc.projects

data class ParticipantInReviewRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO,

	/**
	 * See ParticipantInReviewDTO parameters (required)
	 */
	val participant: ParticipantInReviewDTO
)