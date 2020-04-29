package com.ecwid.upsource.rpc.projects

data class ReviewDescriptorDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO,

	/**
	 * Review title (required)
	 */
	val title: String,

	/**
	 * Review description (optional)
	 */
	val description: String?,

	/**
	 * See ParticipantInReviewDTO parameters (repeated)
	 */
	val participants: List<ParticipantInReviewDTO>,

	/**
	 * Review state: open(1), closed(2) (required)
	 */
	val state: ReviewStateEnum,

	/**
	 * Whether the review is unread by the requester (optional)
	 */
	val isUnread: Boolean?,

	/**
	 * 'true' if all reviewers have accepted the changes but the review is still open (optional)
	 */
	val isReadyToClose: Boolean?,

	/**
	 * Names of tracked branches (repeated)
	 */
	val branch: List<String>,

	/**
	 * List of issue IDs linked to the review (repeated)
	 */
	val issue: List<com.ecwid.upsource.rpc.issuetrackers.IssueIdDTO>,

	/**
	 * Whether the review has been removed (optional)
	 */
	val isRemoved: Boolean?,

	/**
	 * Unix timestamp of review creation (required)
	 */
	val createdAt: Long,

	/**
	 * ID of the user who created the review (optional)
	 */
	val createdBy: String?,

	/**
	 * Unix timestamp of the last update (required)
	 */
	val updatedAt: Long,

	/**
	 * Review completion rate (e.g. accepted by 1 out of 3 reviewers). See CompletionRateDTO parameters (optional)
	 */
	val completionRate: CompletionRateDTO?,

	/**
	 * A list of discussion counters. See SimpleDiscussionCounterDTO parameters (optional)
	 */
	val discussionCounter: SimpleDiscussionCounterDTO?,

	/**
	 * Review due date (Unix timestamp) (optional)
	 */
	val deadline: Long?,

	/**
	 * Whether the review is muted by the currently logged-in user (optional)
	 */
	val isMuted: Boolean?,

	/**
	 * Review labels (repeated)
	 */
	val labels: List<LabelDTO>,

	/**
	 * Merge review: branch to merge from (optional)
	 */
	val mergeFromBranch: String?,

	/**
	 * Merge review: branch to merge into (optional)
	 */
	val mergeToBranch: String?
)