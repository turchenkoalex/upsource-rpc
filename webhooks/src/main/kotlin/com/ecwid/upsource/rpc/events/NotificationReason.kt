package com.ecwid.upsource.rpc.events

/**
 * Reason feed event appears in someone's feed
 */
enum class NotificationReason(val value: Byte, val originalName: String) {
	UNKNOWN(value = 0, originalName = "Unknown"),
	COMMENT_IN_AUTHOR_FEED(value = 1, originalName = "CommentInAuthorFeed"),
	NOTIFY_COMMIT_AUTHOR(value = 2, originalName = "NotifyCommitAuthor"),
	MENTION(value = 3, originalName = "Mention"),
	HASH_TAG_SUBSCRIPTION(value = 4, originalName = "HashTagSubscription"),
	DISCUSSION_IS_STARRED(value = 5, originalName = "DiscussionIsStarred"),
	PARTICIPATED_IN_DISCUSSION(value = 6, originalName = "ParticipatedInDiscussion"),
	PARTICIPATED_IN_REVIEW(value = 7, originalName = "ParticipatedInReview"),
	REPLY(value = 8, originalName = "Reply");

	companion object {
		private val MAP_BY_VALUES = values().associateBy { it.value }
		fun fromValue(value: Byte) = MAP_BY_VALUES[value]
	}
}
