package com.ecwid.upsource.rpc.projects

data class UpdateParticipantInReviewResponseDTO(
	/**
	 * GitHub sync result. see SyncResultEnum parameters (optional)
	 */
	val syncResult: SyncResultEnum?
)