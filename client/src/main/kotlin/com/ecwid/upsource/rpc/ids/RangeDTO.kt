package com.ecwid.upsource.rpc.ids

data class RangeDTO(
	/**
	 * Start offset of the text range (required)
	 */
	val startOffset: Int,

	/**
	 * End offset of the text range (required)
	 */
	val endOffset: Int
) {
	internal constructor() : this(
		startOffset = 0,
		endOffset = 0
	)
}
