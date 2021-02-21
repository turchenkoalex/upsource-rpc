// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.findusages

/**
 * @param fileName A full path to the file starting with a slash (e.g. /directory/file.txt)
 * @param pathToRoot See ProjectItemsListDTO parameters
 */
data class FilePathToRootDTO(
	/**
	 * A full path to the file starting with a slash (e.g. /directory/file.txt) (required)
	 */
	val fileName: String,

	/**
	 * See ProjectItemsListDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.projects.ProjectItemsListDTO
	 */
	val pathToRoot: com.ecwid.upsource.rpc.projects.ProjectItemsListDTO
) {
	internal constructor() : this(
		fileName = "",
		pathToRoot = com.ecwid.upsource.rpc.projects.ProjectItemsListDTO()
	)
}
