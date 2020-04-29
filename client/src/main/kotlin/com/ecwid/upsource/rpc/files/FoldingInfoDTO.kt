package com.ecwid.upsource.rpc.files

data class FoldingInfoDTO(
	/**
	 * Start offset of the foldable range (required)
	 */
	val fromOffset: Int,

	/**
	 * End offset of the foldable range (required)
	 */
	val toOffset: Int,

	/**
	 * Whether the range is initially collapsed (required)
	 */
	val isInitialCollapsed: Boolean,

	/**
	 * Text to be displayed in place of the folded range (required)
	 */
	val collapsedText: String
)