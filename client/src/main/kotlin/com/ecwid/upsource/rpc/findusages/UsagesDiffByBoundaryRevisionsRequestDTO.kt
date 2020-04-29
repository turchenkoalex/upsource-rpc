package com.ecwid.upsource.rpc.findusages

data class UsagesDiffByBoundaryRevisionsRequestDTO(
	/**
	 * Original element. See PsiElementIdDTO parameters (required)
	 */
	val originElement: PsiElementIdDTO,

	/**
	 * ID of the new revision (required)
	 */
	val newRevisionId: String,

	/**
	 * ID of the boundary revision (required)
	 */
	val boundaryRevisionId: String
)