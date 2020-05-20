package com.ecwid.upsource.rpc.misc

enum class WebhookEventEnum(val value: Byte, val originalName: String) {
	COMMENT_ADDED(value = 1, originalName = "CommentAdded"),
	REVIEW_CREATED(value = 2, originalName = "ReviewCreated"),
	REVIEW_PARTICIPANT_COMPLETED(value = 3, originalName = "ReviewParticipantCompleted"),
	NEW_REVIEW_PARTICIPANT(value = 4, originalName = "NewReviewParticipant"),
	REVISION_ADDED_TO_REVIEW(value = 5, originalName = "RevisionAddedToReview"),
	NEW_REVISION(value = 6, originalName = "NewRevision"),
	REVIEW_STATE_CHANGED(value = 7, originalName = "ReviewStateChanged"),
	REVIEW_PARTICIPANT_REMOVED(value = 8, originalName = "ReviewParticipantRemoved"),
	MERGED_TO_DEFAULT_BRANCH(value = 9, originalName = "MergedToDefaultBranch"),
	NEW_BRANCH(value = 10, originalName = "NewBranch"),
	REVIEW_REMOVED(value = 11, originalName = "ReviewRemoved"),
	BRANCH_REMOVED(value = 12, originalName = "BranchRemoved"),
	REACTION_TOGGLED(value = 13, originalName = "ReactionToggled"),
	COMMENT_EDITED(value = 14, originalName = "CommentEdited"),
	COMMENT_REMOVED(value = 15, originalName = "CommentRemoved"),
	REVIEW_LABEL_CHANGED(value = 16, originalName = "ReviewLabelChanged");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
