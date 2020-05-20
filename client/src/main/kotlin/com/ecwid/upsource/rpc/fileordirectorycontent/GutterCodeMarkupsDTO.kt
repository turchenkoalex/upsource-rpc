package com.ecwid.upsource.rpc.fileordirectorycontent

data class GutterCodeMarkupsDTO(
	/**
	 * See GutterCodeMarkupItemDTO parameters (repeated)
	 */
	val items: List<GutterCodeMarkupItemDTO> = emptyList()
)