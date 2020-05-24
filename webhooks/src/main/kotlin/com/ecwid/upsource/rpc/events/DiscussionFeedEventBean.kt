package com.ecwid.upsource.rpc.events

data class DiscussionFeedEventBean(
	/**
	 * Base feed event (required)
	 */
	val base: FeedEventBean,

	/**
	 * Notification reason (required)
	 */
	val notificationReason: NotificationReason,

	/**
	 * Discussion ID (required)
	 */
	val discussionId: String,

	/**
	 * Comment ID (optional)
	 */
	val commentId: String? = null,

	/**
	 * Comment text (optional)
	 */
	val commentText: String? = null,

	/**
	 * Whether the event corresponds to comment editing (optional)
	 */
	val isEdit: Boolean? = null,

	/**
	 * Whether the event corresponds to comment deletion (optional)
	 */
	val isDeletion: Boolean? = null,

	/**
	 * Indicates a change of the discussion's resolved status: true for resolve, false for un-resolve (optional)
	 */
	val resolveAction: Boolean? = null
) {
	internal constructor() : this(
		base = FeedEventBean(),
		notificationReason = NotificationReason.UNKNOWN,
		discussionId = "",
		commentId = null,
		commentText = null,
		isEdit = null,
		isDeletion = null,
		resolveAction = null
	)
}