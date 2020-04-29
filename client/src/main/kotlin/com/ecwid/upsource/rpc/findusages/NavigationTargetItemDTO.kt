package com.ecwid.upsource.rpc.findusages

data class NavigationTargetItemDTO(
	/**
	 * See FileInRevisionDTO parameters (required)
	 */
	val fileId: com.ecwid.upsource.rpc.FileInRevisionDTO,

	/**
	 * Start offset (required)
	 */
	val startOffset: Int,

	/**
	 * End offset (required)
	 */
	val endOffset: Int,

	/**
	 * Stub index ID (required)
	 */
	val stubIndex: Int,

	/**
	 * See TargetDescriptionDTO parameters (optional)
	 */
	val targetDescription: TargetDescriptionDTO?
)