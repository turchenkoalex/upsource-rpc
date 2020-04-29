package com.ecwid.upsource.rpc.analytics

data class ReviewStatisticsDTO(
	/**
	 * Number of open reviews (required)
	 */
	val openReviews: Int,

	/**
	 * Number of closed reviews (required)
	 */
	val closedReviews: Int,

	/**
	 * Number of revisions covered by reviews (required)
	 */
	val allRevisions: Int,

	/**
	 * Number of revisions covered by open reviews (required)
	 */
	val revisionsCoveredByOpenReviews: Int,

	/**
	 * Number of revisions covered by closed reviews (required)
	 */
	val revisionsCoveredByClosedReviews: Int,

	/**
	 * Review counts per author (repeated)
	 */
	val authorStatsByReviews: List<UserValue>,

	/**
	 * Review counts per reviewer (repeated)
	 */
	val reviewerStatsByReviews: List<UserValue>,

	/**
	 * Review revisions counts per author (repeated)
	 */
	val authorStatsByRevisions: List<UserValue>,

	/**
	 * Review revisions counts per reviewer (repeated)
	 */
	val reviewerStatsByRevisions: List<UserValue>,

	/**
	 * Discussion comments statistics. See CommentsStatisticsDTO parameters (required)
	 */
	val commentsStats: CommentsStatisticsDTO
)