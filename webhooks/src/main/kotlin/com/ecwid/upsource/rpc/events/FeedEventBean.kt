package com.ecwid.upsource.rpc.events

data class FeedEventBean(
	/**
	 * User that initiated the event (optional)
	 */
	val userId: UserIdBean? = null,

	/**
	 * List of users that will receive the event in their feeds (repeated)
	 */
	val userIds: List<UserIdBean> = emptyList(),

	/**
	 * Associated review number (optional)
	 */
	val reviewNumber: Int? = null,

	/**
	 * Associated review ID (optional)
	 */
	val reviewId: String? = null,

	/**
	 * Event date (required)
	 */
	val date: Long,

	/**
	 * User that initiated the event (required)
	 */
	val actor: UserIdBean,

	/**
	 * Event ID (optional)
	 */
	val feedEventId: String? = null
) {
	internal constructor() : this(
		userId = null,
		userIds = emptyList(),
		reviewNumber = null,
		reviewId = null,
		date = 0L,
		actor = UserIdBean(),
		feedEventId = null
	)
}
