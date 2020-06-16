package com.ecwid.upsource.rpc.projects

data class RenameReviewResponseDTO(
	/**
	 * GitHub sync result. See SyncResultEnum parameters (optional)
	 */
	val syncResult: SyncResultEnum? = null
)