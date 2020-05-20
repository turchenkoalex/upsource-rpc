package com.ecwid.upsource.rpc.projects

data class UpdateParticipantInReviewRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * State of the participant. See ParticipantStateEnum parameters (required)
	 */
	val state: ParticipantStateEnum
) {
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		state = ParticipantStateEnum.UNREAD
	)
}
