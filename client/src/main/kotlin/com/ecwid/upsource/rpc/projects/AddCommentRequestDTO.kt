package com.ecwid.upsource.rpc.projects

data class AddCommentRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Discussion ID (required)
	 */
	val discussionId: String,

	/**
	 * Text of the comment being added (required)
	 */
	val text: String,

	/**
	 * An ID of the comment you are replying to (optional)
	 */
	val parentId: String?,

	/**
	 * Currently not in use (optional)
	 */
	val markupType: String?
)