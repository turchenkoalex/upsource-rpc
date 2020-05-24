package com.ecwid.upsource.rpc.events

data class ReviewStoppedBranchTrackingFeedEventBean(
	/**
	 * Base feed event (required)
	 */
	val base: FeedEventBean,

	/**
	 * Branch name (required)
	 */
	val branch: String
) {
	internal constructor() : this(
		base = FeedEventBean(),
		branch = ""
	)
}