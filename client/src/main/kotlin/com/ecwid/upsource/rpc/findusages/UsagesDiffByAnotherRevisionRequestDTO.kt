package com.ecwid.upsource.rpc.findusages

data class UsagesDiffByAnotherRevisionRequestDTO(
	/**
	 * Original element. See PsiElementIdDTO parameters (required)
	 */
	val originElement: PsiElementIdDTO,

	/**
	 * ID of the other revision (required)
	 */
	val anotherRevisionId: String,

	/**
	 * Whether the other revision is older (required)
	 */
	val isAnotherOld: Boolean
) {
	internal constructor() : this(
		originElement = PsiElementIdDTO(),
		anotherRevisionId = "",
		isAnotherOld = false
	)
}
