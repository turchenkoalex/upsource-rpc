// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param projectId Project ID in Upsource
 * @param label See LabelDTO parameters
 */
@Suppress("unused")
data class EditLabelRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * See LabelDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.projects.LabelDTO
	 */
	val label: LabelDTO
) {
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		label = LabelDTO()
	)
}

