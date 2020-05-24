package com.ecwid.upsource.rpc.events

data class RemovedParticipantFromReviewFeedEventBean(
	/**
	 * Base feed event (required)
	 */
	val base: FeedEventBean,

	/**
	 * Participant user info (required)
	 */
	val participant: UserIdBean,

	/**
	 * The role participant had before being removed from review (required)
	 */
	val formerRole: ParticipantRole
) {
	internal constructor() : this(
		base = FeedEventBean(),
		participant = UserIdBean(),
		formerRole = ParticipantRole.AUTHOR
	)
}