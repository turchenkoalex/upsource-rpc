// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param projectId Project ID in Upsource
 * @param discussionId Discussion ID
 * @param isFlagged Whether the discussion is flagged (starred)
 */
@Suppress("unused")
data class UpdateDiscussionFlagRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Discussion ID (required)
	 */
	val discussionId: String,

	/**
	 * Whether the discussion is flagged (starred) (required)
	 */
	val isFlagged: Boolean
) {
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		discussionId = "",
		isFlagged = false
	)
}

