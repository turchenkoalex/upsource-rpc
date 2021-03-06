// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.findusages

/**
 * @param fileId See FileInRevisionDTO parameters
 * @param range Text range of the given PSI element
 * @param localIndex Copy of the localIndex from 'ReferenceCodeMarkupItemDTO' to identify the exact PSI element
 */
@Suppress("unused")
data class PsiElementIdDTO(
	/**
	 * See FileInRevisionDTO parameters (required)
	 *
	 * @see com.ecwid.upsource.rpc.ids.FileInRevisionDTO
	 */
	val fileId: com.ecwid.upsource.rpc.ids.FileInRevisionDTO,

	/**
	 * Text range of the given PSI element (required)
	 */
	val range: com.ecwid.upsource.rpc.ids.RangeDTO,

	/**
	 * Copy of the localIndex from 'ReferenceCodeMarkupItemDTO' to identify the exact PSI element (required)
	 */
	val localIndex: Int
) {
	@Suppress("unused")
	internal constructor() : this(
		fileId = com.ecwid.upsource.rpc.ids.FileInRevisionDTO(),
		range = com.ecwid.upsource.rpc.ids.RangeDTO(),
		localIndex = 0
	)
}

