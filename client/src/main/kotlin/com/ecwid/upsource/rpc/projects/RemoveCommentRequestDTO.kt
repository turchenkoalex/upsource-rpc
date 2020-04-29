package com.ecwid.upsource.rpc.projects

data class RemoveCommentRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * An ID of the discussion being removed (required)
	 */
	val discussionId: String,

	/**
	 * An ID of the comment being removed (required)
	 */
	val commentId: String
)