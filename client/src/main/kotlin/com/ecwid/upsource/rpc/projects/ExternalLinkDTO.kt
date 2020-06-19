// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param url External link URL
 * @param prefix External link prefix
 */
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
