// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.ids

/**
 * @param startOffset Start offset of the text range
 * @param endOffset End offset of the text range
 */
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
