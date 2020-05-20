package com.ecwid.upsource.rpc.projects

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
	internal constructor() : this(
		projectId = "",
		discussionId = "",
		commentId = "",
		itemIndex = 0,
		itemValue = false
	)
}
