// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.findusages

/**
 * @param projectId Project ID in Upsource
 * @param revisionId ID of the revision
 * @param fileName A full path to the file starting with a slash (e.g. /directory/file.txt)
 * @param isDeleted Whether the file is deleted
 * @param lastModified Unix timestamp of the last modification
 * @param branch Branch name
 */
@Suppress("unused")
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
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		revisionId = "",
		fileName = "",
		isDeleted = false,
		lastModified = null,
		branch = null
	)
}

