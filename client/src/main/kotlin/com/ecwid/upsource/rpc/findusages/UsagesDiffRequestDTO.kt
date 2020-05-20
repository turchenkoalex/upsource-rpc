package com.ecwid.upsource.rpc.findusages

data class UsagesDiffRequestDTO(
	/**
	 * See UsagesDiffFullRequestDTO parameters (optional)
	 */
	val fullRequest: UsagesDiffFullRequestDTO? = null,

	/**
	 * See UsagesDiffByAnotherRevisionRequestDTO parameters (optional)
	 */
	val requestByAnotherRevision: UsagesDiffByAnotherRevisionRequestDTO? = null,

	/**
	 * See UsagesDiffByBoundaryRevisionsRequestDTO parameters (optional)
	 */
	val requestByBoundaryRevisions: UsagesDiffByBoundaryRevisionsRequestDTO? = null
)