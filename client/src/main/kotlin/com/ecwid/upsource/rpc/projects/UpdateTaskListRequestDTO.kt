// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param projectId Project ID in Upsource
 * @param discussionId An ID of the discussion being updated
 * @param commentId An ID of the comment being updated
 * @param itemIndex Index of the task list item being updated
 * @param itemValue New value of the task list item being updated
 */
@Suppress("unused")
data class UpdateTaskListRequestDTO(
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
	 * Index of the task list item being updated (required)
	 */
	val itemIndex: Int,

	/**
	 * New value of the task list item being updated (required)
	 */
	val itemValue: Boolean
) {
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		discussionId = "",
		commentId = "",
		itemIndex = 0,
		itemValue = false
	)
}

