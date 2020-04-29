package com.ecwid.upsource.rpc.projects

data class UpdateCommentRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * An ID of the discussion being updated (required)
	 */
	val discussionId: String,

	/**
	 * An ID of the comment being updated (required)
	 */
	val commentId: String,

	/**
	 * New text of the comment being updated (required)
	 */
	val text: String,

	/**
	 * Currently not in use (optional)
	 */
	val markupType: String?
)