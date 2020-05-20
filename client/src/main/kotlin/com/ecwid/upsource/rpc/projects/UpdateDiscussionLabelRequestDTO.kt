package com.ecwid.upsource.rpc.projects

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
	 */
	val label: LabelDTO
) {
	internal constructor() : this(
		projectId = "",
		discussionId = "",
		label = LabelDTO()
	)
}
