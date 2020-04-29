package com.ecwid.upsource.rpc.projects

data class FeedItemDTO(
	/**
	 * News feed item ID (required)
	 */
	val feedItemId: String,

	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * See DiscussionInFeedDTO parameters (optional)
	 */
	val discussion: DiscussionInFeedDTO?,

	/**
	 * See RevisionInfoDTO parameters (repeated)
	 */
	val addedRevisions: List<RevisionInfoDTO>,

	/**
	 * See RevisionInfoDTO parameters (repeated)
	 */
	val removedRevisions: List<RevisionInfoDTO>,

	/**
	 * See ParticipantInReviewDTO parameters (optional)
	 */
	val newParticipantInReview: ParticipantInReviewDTO?,

	/**
	 * Show removed participants (optional)
	 */
	val removedParticipantFromReview: String?,

	/**
	 * See ParticipantStateChangedDTO parameters (optional)
	 */
	val participantStateChanged: ParticipantStateChangedDTO?,

	/**
	 * See ShortReviewInfoDTO parameters (optional)
	 */
	val createdReview: ShortReviewInfoDTO?,

	/**
	 * See ShortReviewInfoDTO parameters (optional)
	 */
	val modifiedReview: ShortReviewInfoDTO?,

	/**
	 * See ReviewIdDTO parameters (optional)
	 */
	val removedReview: com.ecwid.upsource.rpc.ReviewIdDTO?,

	/**
	 * See ReviewStateChangedDTO parameters (optional)
	 */
	val reviewStateChanged: ReviewStateChangedDTO?,

	/**
	 * The branch name for the "Review stopped branch tracking" feed event (optional)
	 */
	val branchTrackingStopped: String?,

	/**
	 * undefined (optional)
	 */
	val updatedDeadline: Long?,

	/**
	 * Whether the feed item relates to the pull request action (optional)
	 */
	val pullRequest: String?,

	/**
	 * Unix timestamp (required)
	 */
	val date: Long,

	/**
	 * The ID of the user who performed the feed action (required)
	 */
	val actorId: String,

	/**
	 * Indicates that a review was squashed to a single revision (optional)
	 */
	val squashedToRevision: RevisionInfoDTO?,

	/**
	 * Indicates that a discussion was removed (optional)
	 */
	val removedDiscussionId: String?
)