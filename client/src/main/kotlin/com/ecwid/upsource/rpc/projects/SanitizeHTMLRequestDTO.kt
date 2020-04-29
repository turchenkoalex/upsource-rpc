package com.ecwid.upsource.rpc.projects

data class SanitizeHTMLRequestDTO(
	/**
	 * The HTML string to sanitize (required)
	 */
	val html: String,

	/**
	 * "true" allows only basic HTML markup (text formatting, images, links), "false" additionally allows block-level HTML elements and tables (required)
	 */
	val isBasicMarkup: Boolean
)