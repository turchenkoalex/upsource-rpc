package com.ecwid.upsource.rpc.projects

data class UpdateReviewLabelResponseDTO(
	/**
	 * The review label (required)
	 */
	val label: LabelDTO,

	/**
	 * GitHub sync result. See SyncResultEnum parameters (optional)
	 */
	val syncResult: SyncResultEnum? = null
) {
	internal constructor() : this(
		label = LabelDTO(),
		syncResult = null
	)
}
