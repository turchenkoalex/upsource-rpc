// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.findusages

/**
 * @param text Snippet text
 * @param startLineNumber Start line number
 * @param rangeInSnippet Matching range in the snippet
 * @param rangeInFile Matching range in the file
 */
data class TextSearchSnippet(
	/**
	 * Snippet text (required)
	 */
	val text: String,

	/**
	 * Start line number (required)
	 */
	val startLineNumber: Int,

	/**
	 * Matching range in the snippet (required)
	 */
	val rangeInSnippet: com.ecwid.upsource.rpc.ids.RangeDTO,

	/**
	 * Matching range in the file (required)
	 */
	val rangeInFile: com.ecwid.upsource.rpc.ids.RangeDTO
) {
	@Suppress("unused")
	internal constructor() : this(
		text = "",
		startLineNumber = 0,
		rangeInSnippet = com.ecwid.upsource.rpc.ids.RangeDTO(),
		rangeInFile = com.ecwid.upsource.rpc.ids.RangeDTO()
	)
}
