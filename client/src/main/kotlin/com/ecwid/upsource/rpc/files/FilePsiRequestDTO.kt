package com.ecwid.upsource.rpc.files

data class FilePsiRequestDTO(
	/**
	 * See FileInRevisionDTO parameters (required)
	 */
	val file: com.ecwid.upsource.rpc.FileInRevisionDTO,

	/**
	 * Whether to request references (optional)
	 */
	val requestReferences: Boolean?,

	/**
	 * Whether to request gutter marks (optional)
	 */
	val requestGutterMarks: Boolean?,

	/**
	 * Whether to request inspections (optional)
	 */
	val requestInspections: Boolean?
)