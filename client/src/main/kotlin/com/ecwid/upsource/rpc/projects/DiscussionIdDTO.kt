// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param projectId Project ID in Upsource
 * @param discussionId ID of the discussion
 */
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
