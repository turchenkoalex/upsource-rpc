package com.ecwid.upsource.rpc.projects

data class CommentDTO(
	/**
	 * ID of the discussion (required)
	 */
	val discussionId: String,

	/**
	 * ID of the comment (required)
	 */
	val commentId: String,

	/**
	 * Text of the comment (required)
	 */
	val text: String,

	/**
	 * User ID of the comment author (required)
	 */
	val authorId: String,

	/**
	 * Unix timestamp of the comment (required)
	 */
	val date: Long,

	/**
	 * ID of the parent comment (optional)
	 */
	val parentId: String? = null,

	/**
	 * Whether the comment can be edited (required)
	 */
	val isEditable: Boolean,

	/**
	 * Currently not in use (optional)
	 */
	val markupType: String? = null,

	/**
	 * Whether the discussion is in sync with GitHub (required)
	 */
	val isSynchronized: Boolean,

	/**
	 * GitHub sync result. See SyncResultEnum parameters (optional)
	 */
	val syncResult: SyncResultEnum? = null,

	/**
	 * Whether the comment has been read by the requester (required)
	 */
	val isRead: Boolean,

	/**
	 * Reactions added to the comment (repeated)
	 */
	val reactions: List<ReactionDTO> = emptyList()
) {
	internal constructor() : this(
		discussionId = "",
		commentId = "",
		text = "",
		authorId = "",
		date = 0L,
		parentId = null,
		isEditable = false,
		markupType = null,
		isSynchronized = false,
		syncResult = null,
		isRead = false,
		reactions = emptyList()
	)
}
