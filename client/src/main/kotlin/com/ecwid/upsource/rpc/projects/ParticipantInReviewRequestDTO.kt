package com.ecwid.upsource.rpc.projects

data class ParticipantInReviewRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * See ParticipantInReviewDTO parameters (required)
	 */
	val participant: ParticipantInReviewDTO
) {
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		participant = ParticipantInReviewDTO()
	)
}
