package com.ecwid.upsource.rpc.fileordirectorycontent

data class FileTextMarkupDTO(
	/**
	 * See TextMarkupDTO parameters (repeated)
	 */
	val markup: List<TextMarkupDTO> = emptyList()
)