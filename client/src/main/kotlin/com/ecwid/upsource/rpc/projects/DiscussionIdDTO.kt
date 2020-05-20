package com.ecwid.upsource.rpc.projects

data class DiscussionIdDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * ID of the discussion (required)
	 */
	val discussionId: String
) {
	internal constructor() : this(
		projectId = "",
		discussionId = ""
	)
}
