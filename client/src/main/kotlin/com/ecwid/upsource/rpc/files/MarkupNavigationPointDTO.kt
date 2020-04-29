package com.ecwid.upsource.rpc.files

data class MarkupNavigationPointDTO(
	/**
	 * ID of the target element (required)
	 */
	val targetId: Int,

	/**
	 * Index of the file name as stored in the 'fileNameTable' table of the Upsource database (required)
	 */
	val fileId: Int,

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
	val stubIndex: Int
)