// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param projectId Project ID in Upsource
 * @param labelId Discussion labels IDs
 */
@Suppress("unused")
data class EditLabelsRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Discussion labels IDs (repeated)
	 */
	val labelId: List<String> = emptyList()
) {
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		labelId = emptyList()
	)
}

