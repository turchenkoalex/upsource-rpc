// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.events

/**
 * @param base Base feed event
 * @param revisionId Revision ID (deprecated)
 * @param revisionIds List of revision IDs
 */
@Suppress("unused")
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
	@Suppress("unused")
	internal constructor() : this(
		base = FeedEventBean(),
		revisionId = null,
		revisionIds = emptyList()
	)
}

