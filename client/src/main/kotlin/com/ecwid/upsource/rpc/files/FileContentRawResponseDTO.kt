package com.ecwid.upsource.rpc.files

data class FileContentRawResponseDTO(
	/**
	 * Base64-encoded contents of a file (required)
	 */
	val base64: String
)