package com.ecwid.upsource.rpc.projects

data class ExternalLinkDTO(
	/**
	 * External link URL (required)
	 */
	val url: String,

	/**
	 * External link prefix (required)
	 */
	val prefix: String
) {
	internal constructor() : this(
		url = "",
		prefix = ""
	)
}
