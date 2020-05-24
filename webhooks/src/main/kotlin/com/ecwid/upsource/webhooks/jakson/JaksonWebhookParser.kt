package com.ecwid.upsource.webhooks.jakson

import com.ecwid.upsource.rpc.events.*
import com.ecwid.upsource.webhooks.Webhook
import com.ecwid.upsource.webhooks.WebhookMetadata
import com.ecwid.upsource.webhooks.WebhookParser
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.JavaType
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import java.util.concurrent.ConcurrentHashMap

internal class JaksonWebhookParser : WebhookParser {
	private val objectMapper = ObjectMapper()
		.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
		.registerKotlinModule()
	private val types = ConcurrentHashMap<Class<*>, JavaType>()

	override fun parse(data: String): Webhook {
		val metadata = objectMapper.readValue(data, WebhookMetadata::class.java)
		return when (metadata.dataType) {
			"DeleteBranchEventBean" -> {
				val type = types.computeIfAbsent(DeleteBranchEventBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<DeleteBranchEventBean>>(data, type)
				Webhook.DeleteBranchEventBeanWebhook(metadata, webhookData.data)
			}

			"DiscussionFeedEventBean" -> {
				val type = types.computeIfAbsent(DiscussionFeedEventBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<DiscussionFeedEventBean>>(data, type)
				Webhook.DiscussionFeedEventBeanWebhook(metadata, webhookData.data)
			}

			"FeedEventBean" -> {
				val type = types.computeIfAbsent(FeedEventBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<FeedEventBean>>(data, type)
				Webhook.FeedEventBeanWebhook(metadata, webhookData.data)
			}

			"MergedToDefaultBranchEventBean" -> {
				val type = types.computeIfAbsent(MergedToDefaultBranchEventBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<MergedToDefaultBranchEventBean>>(data, type)
				Webhook.MergedToDefaultBranchEventBeanWebhook(metadata, webhookData.data)
			}

			"NewBranchEventBean" -> {
				val type = types.computeIfAbsent(NewBranchEventBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<NewBranchEventBean>>(data, type)
				Webhook.NewBranchEventBeanWebhook(metadata, webhookData.data)
			}

			"NewParticipantInReviewFeedEventBean" -> {
				val type = types.computeIfAbsent(NewParticipantInReviewFeedEventBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<NewParticipantInReviewFeedEventBean>>(data, type)
				Webhook.NewParticipantInReviewFeedEventBeanWebhook(metadata, webhookData.data)
			}

			"NewRevisionEventBean" -> {
				val type = types.computeIfAbsent(NewRevisionEventBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<NewRevisionEventBean>>(data, type)
				Webhook.NewRevisionEventBeanWebhook(metadata, webhookData.data)
			}

			"ParticipantStateChangedFeedEventBean" -> {
				val type = types.computeIfAbsent(ParticipantStateChangedFeedEventBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<ParticipantStateChangedFeedEventBean>>(data, type)
				Webhook.ParticipantStateChangedFeedEventBeanWebhook(metadata, webhookData.data)
			}

			"PullRequestMergedFeedEventBean" -> {
				val type = types.computeIfAbsent(PullRequestMergedFeedEventBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<PullRequestMergedFeedEventBean>>(data, type)
				Webhook.PullRequestMergedFeedEventBeanWebhook(metadata, webhookData.data)
			}

			"ReactionToggledEventBean" -> {
				val type = types.computeIfAbsent(ReactionToggledEventBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<ReactionToggledEventBean>>(data, type)
				Webhook.ReactionToggledEventBeanWebhook(metadata, webhookData.data)
			}

			"RemovedParticipantFromReviewFeedEventBean" -> {
				val type = types.computeIfAbsent(RemovedParticipantFromReviewFeedEventBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<RemovedParticipantFromReviewFeedEventBean>>(data, type)
				Webhook.RemovedParticipantFromReviewFeedEventBeanWebhook(metadata, webhookData.data)
			}

			"ReviewCreatedFeedEventBean" -> {
				val type = types.computeIfAbsent(ReviewCreatedFeedEventBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<ReviewCreatedFeedEventBean>>(data, type)
				Webhook.ReviewCreatedFeedEventBeanWebhook(metadata, webhookData.data)
			}

			"ReviewDeadlineUpdatedFeedEventBean" -> {
				val type = types.computeIfAbsent(ReviewDeadlineUpdatedFeedEventBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<ReviewDeadlineUpdatedFeedEventBean>>(data, type)
				Webhook.ReviewDeadlineUpdatedFeedEventBeanWebhook(metadata, webhookData.data)
			}

			"ReviewLabelChangedEventBean" -> {
				val type = types.computeIfAbsent(ReviewLabelChangedEventBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<ReviewLabelChangedEventBean>>(data, type)
				Webhook.ReviewLabelChangedEventBeanWebhook(metadata, webhookData.data)
			}

			"ReviewRemovedFeedEventBean" -> {
				val type = types.computeIfAbsent(ReviewRemovedFeedEventBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<ReviewRemovedFeedEventBean>>(data, type)
				Webhook.ReviewRemovedFeedEventBeanWebhook(metadata, webhookData.data)
			}

			"ReviewSquashedFeedEventBean" -> {
				val type = types.computeIfAbsent(ReviewSquashedFeedEventBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<ReviewSquashedFeedEventBean>>(data, type)
				Webhook.ReviewSquashedFeedEventBeanWebhook(metadata, webhookData.data)
			}

			"ReviewStateChangedFeedEventBean" -> {
				val type = types.computeIfAbsent(ReviewStateChangedFeedEventBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<ReviewStateChangedFeedEventBean>>(data, type)
				Webhook.ReviewStateChangedFeedEventBeanWebhook(metadata, webhookData.data)
			}

			"ReviewStoppedBranchTrackingFeedEventBean" -> {
				val type = types.computeIfAbsent(ReviewStoppedBranchTrackingFeedEventBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<ReviewStoppedBranchTrackingFeedEventBean>>(data, type)
				Webhook.ReviewStoppedBranchTrackingFeedEventBeanWebhook(metadata, webhookData.data)
			}

			"RevisionAddedToReviewFeedEventBean" -> {
				val type = types.computeIfAbsent(RevisionAddedToReviewFeedEventBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<RevisionAddedToReviewFeedEventBean>>(data, type)
				Webhook.RevisionAddedToReviewFeedEventBeanWebhook(metadata, webhookData.data)
			}

			"RevisionRemovedFromReviewFeedEventBean" -> {
				val type = types.computeIfAbsent(RevisionRemovedFromReviewFeedEventBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<RevisionRemovedFromReviewFeedEventBean>>(data, type)
				Webhook.RevisionRemovedFromReviewFeedEventBeanWebhook(metadata, webhookData.data)
			}

			"UserIdBean" -> {
				val type = types.computeIfAbsent(UserIdBean::class.java) {
					objectMapper.typeFactory.constructParametricType(WebhookData::class.java, it)
				}
				val webhookData = objectMapper.readValue<WebhookData<UserIdBean>>(data, type)
				Webhook.UserIdBeanWebhook(metadata, webhookData.data)
			}

			else -> Webhook.Unknown
		}
	}
}
