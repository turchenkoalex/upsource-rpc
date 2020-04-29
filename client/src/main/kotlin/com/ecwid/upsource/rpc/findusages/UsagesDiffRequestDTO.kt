package com.ecwid.upsource.rpc.findusages

data class UsagesDiffRequestDTO(
	/**
	 * See UsagesDiffFullRequestDTO parameters (optional)
	 */
	val fullRequest: UsagesDiffFullRequestDTO?,

	/**
	 * See UsagesDiffByAnotherRevisionRequestDTO parameters (optional)
	 */
	val requestByAnotherRevision: UsagesDiffByAnotherRevisionRequestDTO?,

	/**
	 * See UsagesDiffByBoundaryRevisionsRequestDTO parameters (optional)
	 */
	val requestByBoundaryRevisions: UsagesDiffByBoundaryRevisionsRequestDTO?
)