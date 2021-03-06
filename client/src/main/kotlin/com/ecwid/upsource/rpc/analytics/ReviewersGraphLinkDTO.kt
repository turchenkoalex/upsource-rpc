// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.analytics

/**
 * @param from Index of link source user
 * @param to Index of link target user
 * @param strength Link strength
 * @param totalReviewsCount Total reviews count
 * @param recentReviewsCount Recent reviews count
 */
@Suppress("unused")
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
) {
	@Suppress("unused")
	internal constructor() : this(
		from = 0,
		to = 0,
		strength = 0L,
		totalReviewsCount = 0,
		recentReviewsCount = 0
	)
}

