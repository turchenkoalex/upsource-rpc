package com.ecwid.upsource.rpc.events

data class ReviewSquashedFeedEventBean(
	/**
	 * Base feed event (required)
	 */
	val base: FeedEventBean,

	/**
	 * Target Revision ID (required)
	 */
	val revisionId: String
) {
	internal constructor() : this(
		base = FeedEventBean(),
		revisionId = ""
	)
}
