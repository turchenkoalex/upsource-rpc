// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.findusages

/**
 * @param navigationTarget See NavigationTargetItemDTO parameters
 * @param previewText Preview text
 * @param startOffsetInPreview Start offset
 * @param endOffsetInPreview End offset
 * @param lineNumber Line number
 * @param isImportant Identifies if this usage is semantic-sensitive or not
 */
@Suppress("unused")
data class FindUsagesItemDTO(
	/**
	 * See NavigationTargetItemDTO parameters (required)
	 *
	 * @see com.ecwid.upsource.rpc.findusages.NavigationTargetItemDTO
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
) {
	@Suppress("unused")
	internal constructor() : this(
		navigationTarget = NavigationTargetItemDTO(),
		previewText = "",
		startOffsetInPreview = 0,
		endOffsetInPreview = 0,
		lineNumber = 0,
		isImportant = false
	)
}

