package com.ecwid.upsource.rpc.events

data class ParticipantStateChangedFeedEventBean(
	/**
	 * Base feed event (required)
	 */
	val base: FeedEventBean,

	/**
	 * Participant user info (required)
	 */
	val participant: UserIdBean,

	/**
	 * Old state (required)
	 */
	val oldState: ParticipantState,

	/**
	 * New state (required)
	 */
	val newState: ParticipantState
) {
	internal constructor() : this(
		base = FeedEventBean(),
		participant = UserIdBean(),
		oldState = ParticipantState.UNREAD,
		newState = ParticipantState.UNREAD
	)
}
