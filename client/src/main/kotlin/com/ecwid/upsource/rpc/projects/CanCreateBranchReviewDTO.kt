package com.ecwid.upsource.rpc.projects

data class CanCreateBranchReviewDTO(
	/**
	 * A branch review can be created (required)
	 */
	val isAllowed: Boolean,

	/**
	 * A message explaining the reason why a review can't be created (optional)
	 */
	val message: String? = null
) {
	internal constructor() : this(
		isAllowed = false,
		message = null
	)
}
