package com.ecwid.upsource.rpc.fileordirectorycontent

data class FileContentResponseDTO(
	/**
	 * See FileContentTypeDTO parameters (required)
	 */
	val contentType: FileContentTypeDTO,

	/**
	 * See FileContentDTO parameters (optional)
	 */
	val fileContent: FileContentDTO? = null
) {
	internal constructor() : this(
		contentType = FileContentTypeDTO(),
		fileContent = null
	)
}
