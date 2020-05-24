package com.ecwid.upsource.rpc.events

data class NewParticipantInReviewFeedEventBean(
	/**
	 * Base feed event (required)
	 */
	val base: FeedEventBean,

	/**
	 * Participant user info (required)
	 */
	val participant: UserIdBean,

	/**
	 * Participant role (required)
	 */
	val role: ParticipantRole
) {
	internal constructor() : this(
		base = FeedEventBean(),
		participant = UserIdBean(),
		role = ParticipantRole.AUTHOR
	)
}
