package com.ecwid.upsource.rpc.projects

data class ReviewTargetBranchDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * Branch to merge into (required)
	 */
	val targetBranch: String
) {
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		targetBranch = ""
	)
}
