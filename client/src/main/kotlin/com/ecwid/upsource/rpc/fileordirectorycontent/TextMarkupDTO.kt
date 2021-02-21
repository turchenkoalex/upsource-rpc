// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.fileordirectorycontent

/**
 * @param range Text range
 * @param textAttribute See TextAttributeDTO parameters
 */
@Suppress("unused")
data class TextMarkupDTO(
	/**
	 * Text range (required)
	 */
	val range: com.ecwid.upsource.rpc.ids.RangeDTO,

	/**
	 * See TextAttributeDTO parameters (required)
	 *
	 * @see com.ecwid.upsource.rpc.fileordirectorycontent.TextAttributeDTO
	 */
	val textAttribute: TextAttributeDTO
) {
	@Suppress("unused")
	internal constructor() : this(
		range = com.ecwid.upsource.rpc.ids.RangeDTO(),
		textAttribute = TextAttributeDTO()
	)
}

