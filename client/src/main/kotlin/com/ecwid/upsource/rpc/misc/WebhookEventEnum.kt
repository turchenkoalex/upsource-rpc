package com.ecwid.upsource.rpc.misc

/**
 * undefined
 */
enum class WebhookEventEnum(val value: Byte) {
	CommentAdded(1),
	ReviewCreated(2),
	ReviewParticipantCompleted(3),
	NewReviewParticipant(4),
	RevisionAddedToReview(5),
	NewRevision(6),
	ReviewStateChanged(7),
	ReviewParticipantRemoved(8),
	MergedToDefaultBranch(9),
	NewBranch(10),
	ReviewRemoved(11),
	BranchRemoved(12),
	ReactionToggled(13),
	CommentEdited(14),
	CommentRemoved(15),
	ReviewLabelChanged(16);

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}