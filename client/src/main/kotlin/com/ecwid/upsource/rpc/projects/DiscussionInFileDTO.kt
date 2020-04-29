package com.ecwid.upsource.rpc.projects

data class DiscussionInFileDTO(
	/**
	 * ID of the discussion (required)
	 */
	val discussionId: String,

	/**
	 * Current discussion anchor (required)
	 */
	val anchor: AnchorDTO,

	/**
	 * Original discussion anchor (optional)
	 */
	val origin: AnchorDTO?,

	/**
	 * See CommentDTO parameters (repeated)
	 */
	val comments: List<CommentDTO>,

	/**
	 * See ReadEnum parameters (optional)
	 */
	val read: ReadEnum?,

	/**
	 * Whether the discussion is starred (optional)
	 */
	val isStarred: Boolean?,

	/**
	 * See ShortReviewInfoDTO parameters (optional)
	 */
	val review: ShortReviewInfoDTO?,

	/**
	 * Discussion labels. See LabelDTO parameters (repeated)
	 */
	val labels: List<LabelDTO>,

	/**
	 * An ID of the issue linked to the discussion (optional)
	 */
	val issue: String?,

	/**
	 * Whether the discussion is resolved (optional)
	 */
	val isResolved: Boolean?,

	/**
	 * GitHub sync result. see SyncResultEnum parameters (optional)
	 */
	val syncResult: SyncResultEnum?
)