package com.ecwid.upsource.rpc.fileordirectorycontent

data class TextMarkupDTO(
	/**
	 * Text range (required)
	 */
	val range: com.ecwid.upsource.rpc.ids.RangeDTO,

	/**
	 * See TextAttributeDTO parameters (required)
	 */
	val textAttribute: TextAttributeDTO
) {
	internal constructor() : this(
		range = com.ecwid.upsource.rpc.ids.RangeDTO(),
		textAttribute = TextAttributeDTO()
	)
}
