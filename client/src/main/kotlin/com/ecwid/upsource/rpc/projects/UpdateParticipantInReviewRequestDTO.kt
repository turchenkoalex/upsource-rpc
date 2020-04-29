package com.ecwid.upsource.rpc.projects

data class UpdateParticipantInReviewRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO,

	/**
	 * State of the participant. See ParticipantStateEnum parameters (required)
	 */
	val state: ParticipantStateEnum
)