// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param file See FileInRevisionDTO parameters
 * @param startLine Line number the fragment starts with
 * @param endLine Line number the fragment ends with
 */
data class FileFragmentAuthorsRequestDTO(
	/**
	 * See FileInRevisionDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.ids.FileInRevisionDTO
	 */
	val file: com.ecwid.upsource.rpc.ids.FileInRevisionDTO,

	/**
	 * Line number the fragment starts with (required)
	 */
	val startLine: Int,

	/**
	 * Line number the fragment ends with (required)
	 */
	val endLine: Int
) {
	@Suppress("unused")
	internal constructor() : this(
		file = com.ecwid.upsource.rpc.ids.FileInRevisionDTO(),
		startLine = 0,
		endLine = 0
	)
}
