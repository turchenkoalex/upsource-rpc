package com.ecwid.upsource.rpc.projects

data class FileDiffSummaryDTO(
	/**
	 * See FileInRevisionDTO parameters (required)
	 */
	val file: com.ecwid.upsource.rpc.FileInRevisionDTO,

	/**
	 * How many lines were added (required)
	 */
	val addedLines: Int,

	/**
	 * How many lines were deleted (required)
	 */
	val removedLines: Int
)