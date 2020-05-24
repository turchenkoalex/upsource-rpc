package com.ecwid.upsource.rpc.events

data class ReviewStateChangedFeedEventBean(
	/**
	 * Base feed event (required)
	 */
	val base: FeedEventBean,

	/**
	 * Old state (required)
	 */
	val oldState: ReviewState,

	/**
	 * New state (required)
	 */
	val newState: ReviewState
) {
	internal constructor() : this(
		base = FeedEventBean(),
		oldState = ReviewState.OPEN,
		newState = ReviewState.OPEN
	)
}
