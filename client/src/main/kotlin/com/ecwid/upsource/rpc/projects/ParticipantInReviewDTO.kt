package com.ecwid.upsource.rpc.projects

data class ParticipantInReviewDTO(
	/**
	 * Participant user ID (required)
	 */
	val userId: String,

	/**
	 * Participant's role in the review. See RoleInReviewEnum parameters (required)
	 */
	val role: com.ecwid.upsource.rpc.users.RoleInReviewEnum,

	/**
	 * State of the participant. See ParticipantStateEnum parameters (optional)
	 */
	val state: ParticipantStateEnum?
)