package com.ecwid.upsource.rpc.files

data class TextAttributeDTO(
	/**
	 * Foreground color (optional)
	 */
	val fgColor: String?,

	/**
	 * Background color (optional)
	 */
	val bgColor: String?,

	/**
	 * Font style (italic, bold) (optional)
	 */
	val fontStyle: String?,

	/**
	 * Text effect (underline, wave underline, strikeout, etc.) (optional)
	 */
	val effectStyle: String?,

	/**
	 * Effect color (optional)
	 */
	val effectColor: String?,

	/**
	 * Error stripe color (optional)
	 */
	val errorStripeColor: String?
)