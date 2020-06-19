// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.ids

/**
 * @param projectId Project ID in Upsource
 * @param revisionId VCS revision ID
 * @param fileName A full path to the file starting with a slash (e.g. /directory/file.txt)
 */
data class FileInRevisionDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * VCS revision ID (required)
	 */
	val revisionId: String,

	/**
	 * A full path to the file starting with a slash (e.g. /directory/file.txt) (required)
	 */
	val fileName: String
) {
	internal constructor() : this(
		projectId = "",
		revisionId = "",
		fileName = ""
	)
}
