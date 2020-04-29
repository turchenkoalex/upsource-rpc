package com.ecwid.upsource.rpc.files

data class LocalDeclarationRangeDTO(
	/**
	 * ID of the target element (required)
	 */
	val targetId: Int,

	/**
	 * Start offset (required)
	 */
	val startOffset: Int,

	/**
	 * End offset (required)
	 */
	val endOffset: Int
)