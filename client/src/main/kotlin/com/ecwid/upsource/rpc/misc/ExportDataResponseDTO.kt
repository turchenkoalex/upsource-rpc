package com.ecwid.upsource.rpc.misc

data class ExportDataResponseDTO(
	/**
	 * A full path to the server (required)
	 */
	val serverPath: String
) {
	internal constructor() : this(
		serverPath = ""
	)
}
