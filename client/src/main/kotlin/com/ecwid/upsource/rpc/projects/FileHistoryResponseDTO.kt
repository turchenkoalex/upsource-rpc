package com.ecwid.upsource.rpc.projects

data class FileHistoryResponseDTO(
	/**
	 * See FileHistoryItemDTO parameters (repeated)
	 */
	val history: List<FileHistoryItemDTO>,

	/**
	 * See RevisionListGraphDTO parameters (optional)
	 */
	val graph: RevisionListGraphDTO?,

	/**
	 * Whether all available items have been returned or more can be requested by passing the corresponding 'limit' value in the subsequent request (required)
	 */
	val hasMore: Boolean
)