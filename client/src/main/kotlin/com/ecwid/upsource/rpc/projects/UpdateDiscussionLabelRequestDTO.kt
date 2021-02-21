// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param projectId Project ID in Upsource
 * @param discussionId ID of the discussion
 * @param label Discussion label being added or removed. See LabelDTO parameters
 */
@Suppress("unused")
data class UpdateDiscussionLabelRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * ID of the discussion (required)
	 */
	val discussionId: String,

	/**
	 * Discussion label being added or removed. See LabelDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.projects.LabelDTO
	 */
	val label: LabelDTO
) {
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		discussionId = "",
		label = LabelDTO()
	)
}

