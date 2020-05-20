package com.ecwid.upsource.rpc.projects

data class CloseReviewResponseDTO(
	/**
	 * GitHub sync result. see SyncResultEnum parameters (optional)
	 */
	val syncResult: SyncResultEnum? = null
)