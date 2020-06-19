// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param file See FileInRevisionDTO parameters
 * @param addedLines How many lines were added
 * @param removedLines How many lines were deleted
 */
data class FileDiffSummaryDTO(
	/**
	 * See FileInRevisionDTO parameters (required)
	 * 
	 * @see FileInRevisionDTO
	 */
	val file: com.ecwid.upsource.rpc.ids.FileInRevisionDTO,

	/**
	 * How many lines were added (required)
	 */
	val addedLines: Int,

	/**
	 * How many lines were deleted (required)
	 */
	val removedLines: Int
) {
	internal constructor() : this(
		file = com.ecwid.upsource.rpc.ids.FileInRevisionDTO(),
		addedLines = 0,
		removedLines = 0
	)
}
