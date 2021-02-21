// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.findusages

/**
 * @param items See GotoFileItemDTO parameters
 * @param hasMore Whether all available items have been returned or more can be requested by passing the corresponding 'limit' value in the subsequent request
 */
data class GotoFileResponseDTO(
	/**
	 * See GotoFileItemDTO parameters (repeated)
	 * 
	 * @see com.ecwid.upsource.rpc.findusages.GotoFileItemDTO
	 */
	val items: List<GotoFileItemDTO> = emptyList(),

	/**
	 * Whether all available items have been returned or more can be requested by passing the corresponding 'limit' value in the subsequent request (required)
	 */
	val hasMore: Boolean
) {
	internal constructor() : this(
		items = emptyList(),
		hasMore = false
	)
}
