package com.ecwid.upsource.rpc.projects

data class RenameReviewResponseDTO(
	/**
	 * GitHub sync result. see SyncResultEnum parameters (optional)
	 */
	val syncResult: SyncResultEnum?
)