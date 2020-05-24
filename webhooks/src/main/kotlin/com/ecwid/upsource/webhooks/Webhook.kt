package com.ecwid.upsource.webhooks

import com.ecwid.upsource.rpc.events.*

data class WebhookMetadata(
	val majorVersion: Int,
	val minorVersion: Int,
	val projectId: String,
	val dataType: String
)

sealed class Webhook {
	data class DeleteBranchEventBeanWebhook(
		val metadata: WebhookMetadata,
		val data: DeleteBranchEventBean
	) : Webhook()

	data class DiscussionFeedEventBeanWebhook(
		val metadata: WebhookMetadata,
		val data: DiscussionFeedEventBean
	) : Webhook()

	data class FeedEventBeanWebhook(
		val metadata: WebhookMetadata,
		val data: FeedEventBean
	) : Webhook()

	data class MergedToDefaultBranchEventBeanWebhook(
		val metadata: WebhookMetadata,
		val data: MergedToDefaultBranchEventBean
	) : Webhook()

	data class NewBranchEventBeanWebhook(
		val metadata: WebhookMetadata,
		val data: NewBranchEventBean
	) : Webhook()

	data class NewParticipantInReviewFeedEventBeanWebhook(
		val metadata: WebhookMetadata,
		val data: NewParticipantInReviewFeedEventBean
	) : Webhook()

	data class NewRevisionEventBeanWebhook(
		val metadata: WebhookMetadata,
		val data: NewRevisionEventBean
	) : Webhook()

	data class ParticipantStateChangedFeedEventBeanWebhook(
		val metadata: WebhookMetadata,
		val data: ParticipantStateChangedFeedEventBean
	) : Webhook()

	data class PullRequestMergedFeedEventBeanWebhook(
		val metadata: WebhookMetadata,
		val data: PullRequestMergedFeedEventBean
	) : Webhook()

	data class ReactionToggledEventBeanWebhook(
		val metadata: WebhookMetadata,
		val data: ReactionToggledEventBean
	) : Webhook()

	data class RemovedParticipantFromReviewFeedEventBeanWebhook(
		val metadata: WebhookMetadata,
		val data: RemovedParticipantFromReviewFeedEventBean
	) : Webhook()

	data class ReviewCreatedFeedEventBeanWebhook(
		val metadata: WebhookMetadata,
		val data: ReviewCreatedFeedEventBean
	) : Webhook()

	data class ReviewDeadlineUpdatedFeedEventBeanWebhook(
		val metadata: WebhookMetadata,
		val data: ReviewDeadlineUpdatedFeedEventBean
	) : Webhook()

	data class ReviewLabelChangedEventBeanWebhook(
		val metadata: WebhookMetadata,
		val data: ReviewLabelChangedEventBean
	) : Webhook()

	data class ReviewRemovedFeedEventBeanWebhook(
		val metadata: WebhookMetadata,
		val data: ReviewRemovedFeedEventBean
	) : Webhook()

	data class ReviewSquashedFeedEventBeanWebhook(
		val metadata: WebhookMetadata,
		val data: ReviewSquashedFeedEventBean
	) : Webhook()

	data class ReviewStateChangedFeedEventBeanWebhook(
		val metadata: WebhookMetadata,
		val data: ReviewStateChangedFeedEventBean
	) : Webhook()

	data class ReviewStoppedBranchTrackingFeedEventBeanWebhook(
		val metadata: WebhookMetadata,
		val data: ReviewStoppedBranchTrackingFeedEventBean
	) : Webhook()

	data class RevisionAddedToReviewFeedEventBeanWebhook(
		val metadata: WebhookMetadata,
		val data: RevisionAddedToReviewFeedEventBean
	) : Webhook()

	data class RevisionRemovedFromReviewFeedEventBeanWebhook(
		val metadata: WebhookMetadata,
		val data: RevisionRemovedFromReviewFeedEventBean
	) : Webhook()

	data class UserIdBeanWebhook(
		val metadata: WebhookMetadata,
		val data: UserIdBean
	) : Webhook()

	object Unknown : Webhook()
}