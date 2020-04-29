package com.ecwid.upsource.rpc.projects

data class ResolveDiscussionRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * ID of the discussion (required)
	 */
	val discussionId: String,

	/**
	 * Whether the discussion is resolved (required)
	 */
	val isResolved: Boolean,

	/**
	 * ID of the revision the discussion is linked to (optional)
	 */
	val revision: String?
)