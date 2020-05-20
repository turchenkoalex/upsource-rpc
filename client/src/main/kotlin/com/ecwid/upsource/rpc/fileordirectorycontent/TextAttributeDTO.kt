package com.ecwid.upsource.rpc.fileordirectorycontent

data class TextAttributeDTO(
	/**
	 * Foreground color (optional)
	 */
	val fgColor: String? = null,

	/**
	 * Background color (optional)
	 */
	val bgColor: String? = null,

	/**
	 * Font style (italic, bold) (optional)
	 */
	val fontStyle: String? = null,

	/**
	 * Text effect (underline, wave underline, strikeout, etc.) (optional)
	 */
	val effectStyle: String? = null,

	/**
	 * Effect color (optional)
	 */
	val effectColor: String? = null,

	/**
	 * Error stripe color (optional)
	 */
	val errorStripeColor: String? = null
)