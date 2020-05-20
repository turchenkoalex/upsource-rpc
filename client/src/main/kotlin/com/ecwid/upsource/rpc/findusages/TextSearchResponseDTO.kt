package com.ecwid.upsource.rpc.findusages

data class TextSearchResponseDTO(
	/**
	 * The items that match the search query (repeated)
	 */
	val items: List<TextSearchItem> = emptyList()
)