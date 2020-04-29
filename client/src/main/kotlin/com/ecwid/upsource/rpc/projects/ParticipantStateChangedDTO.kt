package com.ecwid.upsource.rpc.projects

data class ParticipantStateChangedDTO(
	/**
	 * An Upsource user ID of the participant (required)
	 */
	val participant: String,

	/**
	 * See ParticipantStateEnum parameters (required)
	 */
	val oldState: ParticipantStateEnum,

	/**
	 * See ParticipantStateEnum parameters (required)
	 */
	val newState: ParticipantStateEnum
)