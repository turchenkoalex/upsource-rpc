package com.ecwid.upsource.rpc.files

data class FileContentResponseDTO(
	/**
	 * See FileContentTypeDTO parameters (required)
	 */
	val contentType: FileContentTypeDTO,

	/**
	 * See FileContentDTO parameters (optional)
	 */
	val fileContent: FileContentDTO?
)