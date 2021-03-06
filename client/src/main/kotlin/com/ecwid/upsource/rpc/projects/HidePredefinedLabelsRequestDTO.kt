// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param projectId Project ID in Upsource
 * @param doHide Whether to show or hide predefined labels
 */
@Suppress("unused")
data class HidePredefinedLabelsRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Whether to show or hide predefined labels (required)
	 */
	val doHide: Boolean
) {
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		doHide = false
	)
}

