package com.ecwid.upsource.rpc.projects

data class FileDiffResponseDTO(
	/**
	 * See FileInRevisionDTO parameters (optional)
	 */
	val leftFile: com.ecwid.upsource.rpc.ids.FileInRevisionDTO? = null,

	/**
	 * See FileInRevisionDTO parameters (optional)
	 */
	val rightFile: com.ecwid.upsource.rpc.ids.FileInRevisionDTO? = null,

	/**
	 * See FileDiffFragmentDTO parameters (repeated)
	 */
	val fragments: List<FileDiffFragmentDTO> = emptyList()
)