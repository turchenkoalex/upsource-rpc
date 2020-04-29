package com.ecwid.upsource.rpc

data class RangeDTO(
	/**
	 * Start offset of the text range (required)
	 */
	val startOffset: Int,

	/**
	 * End offset of the text range (required)
	 */
	val endOffset: Int
)