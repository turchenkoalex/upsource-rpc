package com.ecwid.upsource.rpc.projects

data class RemoveCommentResponseDTO(
	/**
	 * GitHub sync result. see SyncResultEnum parameters (optional)
	 */
	val syncResult: SyncResultEnum?
)