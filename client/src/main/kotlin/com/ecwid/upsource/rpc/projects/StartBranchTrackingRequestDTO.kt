package com.ecwid.upsource.rpc.projects

data class StartBranchTrackingRequestDTO(
	/**
	 * Review ID (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO,

	/**
	 * Branch name to track (required)
	 */
	val branch: String
)