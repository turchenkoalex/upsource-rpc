package com.ecwid.upsource.rpc.projects

data class FileDiffFragmentDTO(
	/**
	 * Line number to start with (required)
	 */
	val leftFileStartLine: Int,

	/**
	 * How many lines (required)
	 */
	val leftFileLineCount: Int,

	/**
	 * Line number to start with (required)
	 */
	val rightFileStartLine: Int,

	/**
	 * How many lines (required)
	 */
	val rightFileLineCount: Int,

	/**
	 * Indicates that a fragment is unchanged ("true" for unchanged commented lines) (required)
	 */
	val isUnchanged: Boolean,

	/**
	 * Ranges of text that were added (repeated)
	 */
	val addedRanges: List<com.ecwid.upsource.rpc.ids.RangeDTO> = emptyList(),

	/**
	 * Ranges of text that were deleted (repeated)
	 */
	val deletedRanges: List<com.ecwid.upsource.rpc.ids.RangeDTO> = emptyList()
) {
	internal constructor() : this(
		leftFileStartLine = 0,
		leftFileLineCount = 0,
		rightFileStartLine = 0,
		rightFileLineCount = 0,
		isUnchanged = false,
		addedRanges = emptyList(),
		deletedRanges = emptyList()
	)
}
