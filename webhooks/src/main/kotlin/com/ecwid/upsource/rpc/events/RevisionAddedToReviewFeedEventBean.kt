package com.ecwid.upsource.rpc.events

data class RevisionAddedToReviewFeedEventBean(
	/**
	 * Base feed event (required)
	 */
	val base: FeedEventBean,

	/**
	 * Revision ID (deprecated) (optional)
	 */
	val revisionId: String? = null,

	/**
	 * List of revision IDs (repeated)
	 */
	val revisionIds: List<String> = emptyList()
) {
	internal constructor() : this(
		base = FeedEventBean(),
		revisionId = null,
		revisionIds = emptyList()
	)
}
