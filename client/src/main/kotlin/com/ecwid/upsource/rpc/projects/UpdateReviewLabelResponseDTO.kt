package com.ecwid.upsource.rpc.projects

data class UpdateReviewLabelResponseDTO(
	/**
	 * The review label (required)
	 */
	val label: LabelDTO,

	/**
	 * GitHub sync result. see SyncResultEnum parameters (optional)
	 */
	val syncResult: SyncResultEnum?
)