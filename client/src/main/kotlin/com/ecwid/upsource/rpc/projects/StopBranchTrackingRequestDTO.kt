package com.ecwid.upsource.rpc.projects

data class StopBranchTrackingRequestDTO(
	/**
	 * Review ID (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO,

	/**
	 * Branch name to stop tracking. When none specified, tracking of all branches will stop. (optional)
	 */
	val branch: String?
)