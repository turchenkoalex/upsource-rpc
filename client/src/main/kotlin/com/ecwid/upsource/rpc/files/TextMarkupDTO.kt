package com.ecwid.upsource.rpc.files

data class TextMarkupDTO(
	/**
	 * Text range (required)
	 */
	val range: com.ecwid.upsource.rpc.RangeDTO,

	/**
	 * See TextAttributeDTO parameters (required)
	 */
	val textAttribute: TextAttributeDTO
)