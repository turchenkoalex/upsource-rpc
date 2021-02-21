// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param file See FileInRevisionDTO parameters
 * @param limit History size limit
 * @param skip Number of history entries (file revisions) to skip from the top (for pagination)
 */
@Suppress("unused")
data class FileHistoryRequestDTO(
	/**
	 * See FileInRevisionDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.ids.FileInRevisionDTO
	 */
	val file: com.ecwid.upsource.rpc.ids.FileInRevisionDTO,

	/**
	 * History size limit (required)
	 */
	val limit: Int,

	/**
	 * Number of history entries (file revisions) to skip from the top (for pagination) (optional)
	 */
	val skip: Int? = null
) {
	@Suppress("unused")
	internal constructor() : this(
		file = com.ecwid.upsource.rpc.ids.FileInRevisionDTO(),
		limit = 0,
		skip = null
	)
}

