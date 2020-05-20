package com.ecwid.upsource.rpc.fileordirectorycontent

data class FileContentRawResponseDTO(
	/**
	 * Base64-encoded contents of a file (required)
	 */
	val base64: String
) {
	internal constructor() : this(
		base64 = ""
	)
}
