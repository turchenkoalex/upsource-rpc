// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.fileordirectorycontent

/**
 * @param contentType See FileContentTypeDTO parameters
 * @param fileContent See FileContentDTO parameters
 */
@Suppress("unused")
data class FileContentResponseDTO(
	/**
	 * See FileContentTypeDTO parameters (required)
	 *
	 * @see com.ecwid.upsource.rpc.fileordirectorycontent.FileContentTypeDTO
	 */
	val contentType: FileContentTypeDTO,

	/**
	 * See FileContentDTO parameters (optional)
	 *
	 * @see com.ecwid.upsource.rpc.fileordirectorycontent.FileContentDTO
	 */
	val fileContent: FileContentDTO? = null
) {
	@Suppress("unused")
	internal constructor() : this(
		contentType = FileContentTypeDTO(),
		fileContent = null
	)
}

