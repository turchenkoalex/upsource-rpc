package com.ecwid.upsource.rpc.projects

data class ReviewDescriptorDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * Review title (required)
	 */
	val title: String,

	/**
	 * Review description (optional)
	 */
	val description: String? = null,

	/**
	 * See ParticipantInReviewDTO parameters (repeated)
	 */
	val participants: List<ParticipantInReviewDTO> = emptyList(),

	/**
	 * Review state: open(1), closed(2) (required)
	 */
	val state: ReviewStateEnum,

	/**
	 * Whether the review is unread by the requester (optional)
	 */
	val isUnread: Boolean? = null,

	/**
	 * 'true' if all reviewers have accepted the changes but the review is still open (optional)
	 */
	val isReadyToClose: Boolean? = null,

	/**
	 * Names of tracked branches (repeated)
	 */
	val branch: List<String> = emptyList(),

	/**
	 * List of issue IDs linked to the review (repeated)
	 */
	val issue: List<com.ecwid.upsource.rpc.issuetrackers.IssueIdDTO> = emptyList(),

	/**
	 * Whether the review has been removed (optional)
	 */
	val isRemoved: Boolean? = null,

	/**
	 * Unix timestamp of review creation (required)
	 */
	val createdAt: Long,

	/**
	 * ID of the user who created the review (optional)
	 */
	val createdBy: String? = null,

	/**
	 * Unix timestamp of the last update (required)
	 */
	val updatedAt: Long,

	/**
	 * Review completion rate (e.g. accepted by 1 out of 3 reviewers). See CompletionRateDTO parameters (optional)
	 */
	val completionRate: CompletionRateDTO? = null,

	/**
	 * A list of discussion counters. See SimpleDiscussionCounterDTO parameters (optional)
	 */
	val discussionCounter: SimpleDiscussionCounterDTO? = null,

	/**
	 * Review due date (Unix timestamp) (optional)
	 */
	val deadline: Long? = null,

	/**
	 * Whether the review is muted by the currently logged-in user (optional)
	 */
	val isMuted: Boolean? = null,

	/**
	 * Review labels (repeated)
	 */
	val labels: List<LabelDTO> = emptyList(),

	/**
	 * Merge review: branch to merge from (optional)
	 */
	val mergeFromBranch: String? = null,

	/**
	 * Merge review: branch to merge into (optional)
	 */
	val mergeToBranch: String? = null
) {
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		title = "",
		description = null,
		participants = emptyList(),
		state = ReviewStateEnum.OPEN,
		isUnread = null,
		isReadyToClose = null,
		branch = emptyList(),
		issue = emptyList(),
		isRemoved = null,
		createdAt = 0L,
		createdBy = null,
		updatedAt = 0L,
		completionRate = null,
		discussionCounter = null,
		deadline = null,
		isMuted = null,
		labels = emptyList(),
		mergeFromBranch = null,
		mergeToBranch = null
	)
}
