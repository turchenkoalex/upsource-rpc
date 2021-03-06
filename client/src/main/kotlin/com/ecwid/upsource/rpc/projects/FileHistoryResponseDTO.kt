// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param history See FileHistoryItemDTO parameters
 * @param graph See RevisionListGraphDTO parameters
 * @param hasMore Whether all available items have been returned or more can be requested by passing the corresponding 'limit' value in the subsequent request
 */
@Suppress("unused")
data class FileHistoryResponseDTO(
	/**
	 * See FileHistoryItemDTO parameters (repeated)
	 *
	 * @see com.ecwid.upsource.rpc.projects.FileHistoryItemDTO
	 */
	val history: List<FileHistoryItemDTO> = emptyList(),

	/**
	 * See RevisionListGraphDTO parameters (optional)
	 *
	 * @see com.ecwid.upsource.rpc.projects.RevisionListGraphDTO
	 */
	val graph: RevisionListGraphDTO? = null,

	/**
	 * Whether all available items have been returned or more can be requested by passing the corresponding 'limit' value in the subsequent request (required)
	 */
	val hasMore: Boolean
) {
	@Suppress("unused")
	internal constructor() : this(
		history = emptyList(),
		graph = null,
		hasMore = false
	)
}

