package com.ecwid.upsource.rpc.projects

data class ReviewTargetBranchDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO,

	/**
	 * Branch to merge into (required)
	 */
	val targetBranch: String
)