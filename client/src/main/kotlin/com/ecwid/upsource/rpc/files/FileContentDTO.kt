package com.ecwid.upsource.rpc.files

data class FileContentDTO(
	/**
	 * File text (required)
	 */
	val text: String,

	/**
	 * See FoldingInfoDTO parameters (repeated)
	 */
	val foldings: List<FoldingInfoDTO>,

	/**
	 * Whether syntax markup is available for this file type (optional)
	 */
	val isSyntaxSupported: Boolean?,

	/**
	 * See TextMarkupDTO parameters (repeated)
	 */
	val syntax: List<TextMarkupDTO>
)