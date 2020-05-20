package com.ecwid.upsource.rpc.projects

data class UpdateCommentResponseDTO(
	/**
	 * GitHub sync result. see SyncResultEnum parameters (optional)
	 */
	val syncResult: SyncResultEnum? = null
)