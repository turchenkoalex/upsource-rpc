package com.ecwid.upsource.rpc.findusages

data class FindUsagesItemDTO(
	/**
	 * See NavigationTargetItemDTO parameters (required)
	 */
	val navigationTarget: NavigationTargetItemDTO,

	/**
	 * Preview text (required)
	 */
	val previewText: String,

	/**
	 * Start offset (required)
	 */
	val startOffsetInPreview: Int,

	/**
	 * End offset (required)
	 */
	val endOffsetInPreview: Int,

	/**
	 * Line number (required)
	 */
	val lineNumber: Int,

	/**
	 * Identifies if this usage is semantic-sensitive or not (required)
	 */
	val isImportant: Boolean
)