package com.ecwid.upsource.rpc.findusages

data class GotoFileResponseDTO(
	/**
	 * See GotoFileItemDTO parameters (repeated)
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
