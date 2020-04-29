package com.ecwid.upsource.rpc.projects

data class DiscussionInFeedDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Discussion ID (required)
	 */
	val discussionId: String,

	/**
	 * See AnchorDTO parameters (required)
	 */
	val anchor: AnchorDTO,

	/**
	 * See CommentDTO parameters (repeated)
	 */
	val comments: List<CommentDTO>,

	/**
	 * See ShortReviewInfoDTO parameters (optional)
	 */
	val review: ShortReviewInfoDTO?,

	/**
	 * Discussion labels. See LabelDTO parameters (repeated)
	 */
	val labels: List<LabelDTO>,

	/**
	 * Whether a discussion has been read by the requester (optional)
	 */
	val read: ReadEnum?,

	/**
	 * Whether a discussion has been starred by the requester (optional)
	 */
	val isStarred: Boolean?,

	/**
	 * An ID of the first unread comment (optional)
	 */
	val firstUnreadCommentId: String?,

	/**
	 * An ID of the issue linked to the discussion (optional)
	 */
	val issue: String?,

	/**
	 * Whether the discussion is resolved (optional)
	 */
	val isResolved: Boolean?,

	/**
	 * If the discussion is resolved, contains the ID of the user who resolved it (optional)
	 */
	val resolvedBy: String?
)