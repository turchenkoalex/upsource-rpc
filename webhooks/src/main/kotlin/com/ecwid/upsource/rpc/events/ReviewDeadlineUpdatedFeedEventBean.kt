package com.ecwid.upsource.rpc.events

data class ReviewDeadlineUpdatedFeedEventBean(
	/**
	 * Base feed event (required)
	 */
	val base: FeedEventBean,

	/**
	 * Review due date (Unix timestamp) (optional)
	 */
	val deadline: Long? = null
) {
	internal constructor() : this(
		base = FeedEventBean(),
		deadline = null
	)
}
