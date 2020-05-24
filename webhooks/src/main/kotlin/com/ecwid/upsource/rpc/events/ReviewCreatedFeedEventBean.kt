package com.ecwid.upsource.rpc.events

data class ReviewCreatedFeedEventBean(
	/**
	 * Base feed event (required)
	 */
	val base: FeedEventBean,

	/**
	 * List of revisions that were added to review at time of creation (repeated)
	 */
	val revisions: List<String> = emptyList(),

	/**
	 * Name of the branch being tracked by the review (optional)
	 */
	val branch: String? = null
) {
	internal constructor() : this(
		base = FeedEventBean(),
		revisions = emptyList(),
		branch = null
	)
}