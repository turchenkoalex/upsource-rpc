// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.fileordirectorycontent

/**
 * @param file See FileInRevisionDTO parameters
 * @param requestReferences Whether to request references
 * @param requestGutterMarks Whether to request gutter marks
 * @param requestInspections Whether to request inspections
 */
@Suppress("unused")
data class FilePsiRequestDTO(
	/**
	 * See FileInRevisionDTO parameters (required)
	 *
	 * @see com.ecwid.upsource.rpc.ids.FileInRevisionDTO
	 */
	val file: com.ecwid.upsource.rpc.ids.FileInRevisionDTO,

	/**
	 * Whether to request references (optional)
	 */
	val requestReferences: Boolean? = null,

	/**
	 * Whether to request gutter marks (optional)
	 */
	val requestGutterMarks: Boolean? = null,

	/**
	 * Whether to request inspections (optional)
	 */
	val requestInspections: Boolean? = null
) {
	@Suppress("unused")
	internal constructor() : this(
		file = com.ecwid.upsource.rpc.ids.FileInRevisionDTO(),
		requestReferences = null,
		requestGutterMarks = null,
		requestInspections = null
	)
}

