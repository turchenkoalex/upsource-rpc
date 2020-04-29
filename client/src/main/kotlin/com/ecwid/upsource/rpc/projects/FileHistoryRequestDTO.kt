package com.ecwid.upsource.rpc.projects

data class FileHistoryRequestDTO(
	/**
	 * See FileInRevisionDTO parameters (required)
	 */
	val file: com.ecwid.upsource.rpc.FileInRevisionDTO,

	/**
	 * History size limit (required)
	 */
	val limit: Int,

	/**
	 * Number of history entries (file revisions) to skip from the top (for pagination) (optional)
	 */
	val skip: Int?
)