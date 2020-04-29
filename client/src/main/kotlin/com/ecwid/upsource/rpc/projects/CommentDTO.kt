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
	val parentId: String?,

	/**
	 * Whether the comment can be edited (required)
	 */
	val isEditable: Boolean,

	/**
	 * Currently not in use (optional)
	 */
	val markupType: String?,

	/**
	 * Whether the discussion is in sync with GitHub (required)
	 */
	val isSynchronized: Boolean,

	/**
	 * GitHub sync result. see SyncResultEnum parameters (optional)
	 */
	val syncResult: SyncResultEnum?,

	/**
	 * Whether the comment has been read by the requester (required)
	 */
	val isRead: Boolean,

	/**
	 * Reactions added to the comment (repeated)
	 */
	val reactions: List<ReactionDTO>
)