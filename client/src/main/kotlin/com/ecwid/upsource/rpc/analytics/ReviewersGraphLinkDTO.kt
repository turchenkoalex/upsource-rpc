package com.ecwid.upsource.rpc.analytics

data class ReviewersGraphLinkDTO(
	/**
	 * Index of link source user (required)
	 */
	val from: Int,

	/**
	 * Index of link target user (required)
	 */
	val to: Int,

	/**
	 * Link strength (required)
	 */
	val strength: Long,

	/**
	 * Total reviews count (required)
	 */
	val totalReviewsCount: Int,

	/**
	 * Recent reviews count (required)
	 */
	val recentReviewsCount: Int
)