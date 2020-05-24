package com.ecwid.upsource.rpc.events

data class PullRequestMergedFeedEventBean(
	/**
	 * Base feed event (required)
	 */
	val base: FeedEventBean,

	/**
	 * Branch name (required)
	 */
	val pullRequest: String
) {
	internal constructor() : this(
		base = FeedEventBean(),
		pullRequest = ""
	)
}
