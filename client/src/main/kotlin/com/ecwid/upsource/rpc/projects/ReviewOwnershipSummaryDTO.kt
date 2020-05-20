package com.ecwid.upsource.rpc.projects

data class ReviewOwnershipSummaryDTO(
	/**
	 * See FileOwnershipSummaryDTO parameters (repeated)
	 */
	val files: List<FileOwnershipSummaryDTO> = emptyList()
)