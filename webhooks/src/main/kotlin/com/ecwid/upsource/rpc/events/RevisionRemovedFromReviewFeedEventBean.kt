package com.ecwid.upsource.rpc.events

data class RevisionRemovedFromReviewFeedEventBean(
	/**
	 * Base feed event (required)
	 */
	val base: FeedEventBean,

	/**
	 * List of revision IDs (repeated)
	 */
	val revisionIds: List<String> = emptyList()
) {
	internal constructor() : this(
		base = FeedEventBean(),
		revisionIds = emptyList()
	)
}
