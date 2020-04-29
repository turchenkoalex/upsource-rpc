package com.ecwid.upsource.rpc.projects

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
)