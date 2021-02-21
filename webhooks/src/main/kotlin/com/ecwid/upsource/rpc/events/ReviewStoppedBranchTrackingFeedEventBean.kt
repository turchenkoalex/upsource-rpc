// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.events

/**
 * @param base Base feed event
 * @param branch Branch name
 */
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
	@Suppress("unused")
	internal constructor() : this(
		base = FeedEventBean(),
		branch = ""
	)
}
