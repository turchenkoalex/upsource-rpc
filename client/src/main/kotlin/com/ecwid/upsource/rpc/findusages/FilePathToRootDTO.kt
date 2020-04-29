package com.ecwid.upsource.rpc.findusages

data class FilePathToRootDTO(
	/**
	 * A full path to the file starting with a slash (e.g. /directory/file.txt) (required)
	 */
	val fileName: String,

	/**
	 * See ProjectItemsListDTO parameters (required)
	 */
	val pathToRoot: com.ecwid.upsource.rpc.projects.ProjectItemsListDTO
)