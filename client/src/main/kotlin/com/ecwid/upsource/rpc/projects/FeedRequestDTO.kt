package com.ecwid.upsource.rpc.projects

data class FeedRequestDTO(
	/**
	 * Number of news feed messages returned (required)
	 */
	val limit: Int,

	/**
	 * Feed type, see FeedTypeEnum for possible values (required)
	 */
	val type: FeedTypeEnum,

	/**
	 * Project ID in Upsource (optional)
	 */
	val projectId: String?,

	/**
	 * Review ID (optional)
	 */
	val reviewId: String?,

	/**
	 * Search query. Use '#my' to request the personal feed, or leave empty for the full feed (optional)
	 */
	val searchQuery: String?,

	/**
	 * Review feed sorting ('Natural' by default) (optional)
	 */
	val reviewFeedSort: ReviewFeedSortEnum?
)