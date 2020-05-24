package com.ecwid.upsource.rpc.events

data class ReviewLabelChangedEventBean(
	/**
	 * Review ID (required)
	 */
	val reviewId: String,

	/**
	 * Label ID (required)
	 */
	val labelId: String,

	/**
	 * Label name (required)
	 */
	val labelName: String,

	/**
	 * Whether the label was added or removed (required)
	 */
	val wasAdded: Boolean,

	/**
	 * User who changed label (required)
	 */
	val actor: UserIdBean
) {
	internal constructor() : this(
		reviewId = "",
		labelId = "",
		labelName = "",
		wasAdded = false,
		actor = UserIdBean()
	)
}