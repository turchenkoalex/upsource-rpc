package com.ecwid.upsource.rpc.findusages

data class GotoFileItemDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * ID of the revision (required)
	 */
	val revisionId: String,

	/**
	 * A full path to the file starting with a slash (e.g. /directory/file.txt) (required)
	 */
	val fileName: String,

	/**
	 * Whether the file is deleted (required)
	 */
	val isDeleted: Boolean,

	/**
	 * Unix timestamp of the last modification (optional)
	 */
	val lastModified: Long? = null,

	/**
	 * Branch name (optional)
	 */
	val branch: String? = null
) {
	internal constructor() : this(
		projectId = "",
		revisionId = "",
		fileName = "",
		isDeleted = false,
		lastModified = null,
		branch = null
	)
}
