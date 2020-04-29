package com.ecwid.upsource.rpc.files

data class FileContentTypeDTO(
	/**
	 * Whether the file is presentable as text (required)
	 */
	val isText: Boolean,

	/**
	 * Whether the file is a directory (required)
	 */
	val isDirectory: Boolean,

	/**
	 * Whether file contents are generated (required)
	 */
	val isGenerated: Boolean,

	/**
	 * Whether the file can be downloaded (required)
	 */
	val canDownload: Boolean,

	/**
	 * File extension (required)
	 */
	val fileType: String
)