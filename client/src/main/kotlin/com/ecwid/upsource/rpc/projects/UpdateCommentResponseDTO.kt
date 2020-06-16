package com.ecwid.upsource.rpc.projects

data class UpdateCommentResponseDTO(
	/**
	 * GitHub sync result. See SyncResultEnum parameters (optional)
	 */
	val syncResult: SyncResultEnum? = null
)