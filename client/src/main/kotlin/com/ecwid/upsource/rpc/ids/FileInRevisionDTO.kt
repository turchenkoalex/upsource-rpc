package com.ecwid.upsource.rpc.ids

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