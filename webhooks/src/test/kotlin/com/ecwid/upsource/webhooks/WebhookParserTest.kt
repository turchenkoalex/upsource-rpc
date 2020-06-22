package com.ecwid.upsource.webhooks

import com.ecwid.upsource.rpc.events.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class WebhookParserTest {
	private val parser = WebhookParser.newParser()

	@Test
	fun `NewRevisionEventBean test`() {
		val data = readResource("NewRevisionEventBean.json")
		val webhook = parser.parse(data)

		require(webhook is Webhook.NewRevisionEventBeanWebhook)

		assertEquals(
			WebhookMetadata(
				majorVersion = 3,
				minorVersion = 0,
				projectId = "demo-project",
				dataType = "NewRevisionEventBean"
			), webhook.metadata
		)

		assertEquals(
			NewRevisionEventBean(
				revisionId = "c1f4de8e6c5aca9b5615fa6656e1f26e4f26d0d0",
				branches = listOf("master"),
				author = "John Doe <john.doe@mycompany.com>",
				message = "#DSH-325 extract directives describes to top level\n",
				date = 1454432013000L
			), webhook.data
		)
	}

	@Test
	fun `ReviewStateChangedFeedEventBean test`() {
		val data = readResource("ReviewStateChangedFeedEventBean.json")
		val webhook = parser.parse(data)

		require(webhook is Webhook.ReviewStateChangedFeedEventBeanWebhook)

		assertEquals(
			WebhookMetadata(
				majorVersion = 2019,
				minorVersion = 1,
				projectId = "demo",
				dataType = "ReviewStateChangedFeedEventBean"
			), webhook.metadata
		)

		assertEquals(
			ReviewStateChangedFeedEventBean(
				base = FeedEventBean(
					userIds = listOf(
						UserIdBean(userId = "e630cdce-0897-472f-8cc2-12ca9ed95984", userName = "dev1", userEmail = "dev1@example.com"),
						UserIdBean(userId = "12e4492d-0b47-4d90-87f7-813e774cb4a3", userName = "dev2", userEmail = "dev2@example.com"),
						UserIdBean(userId = "c16d9741-65d2-4cec-a21a-01102e911889", userName = "dev3", userEmail = "dev3@example.com")
					),
					reviewId = "DEMO-CR-1001",
					reviewNumber = 1001,
					actor = UserIdBean(userId = "12e4492d-0b47-4d90-87f7-813e774cb4a3", userName = "dev2", userEmail = "dev2@example.com"),
					feedEventId = "1592482575648#demo#eb9af51d-c297-40e4-8f84-2ac6666b8a82",
					date = 1592482575648L
				),
				oldState = ReviewState.OPEN,
				newState = ReviewState.CLOSED
			), webhook.data
		)
	}

	@Test
	fun `NewParticipantInReviewFeedEventBean test`() {
		val data = readResource("NewParticipantInReviewFeedEventBean.json")
		val webhook = parser.parse(data)

		require(webhook is Webhook.NewParticipantInReviewFeedEventBeanWebhook)

		assertEquals(
			WebhookMetadata(
				majorVersion = 2019,
				minorVersion = 1,
				projectId = "demo",
				dataType = "NewParticipantInReviewFeedEventBean"
			), webhook.metadata
		)

		assertEquals(
			NewParticipantInReviewFeedEventBean(
				base = FeedEventBean(
					userIds = listOf(
						UserIdBean(userId = "e630cdce-0897-472f-8cc2-12ca9ed95984", userName = "dev1", userEmail = "dev1@example.com"),
						UserIdBean(userId = "12e4492d-0b47-4d90-87f7-813e774cb4a3", userName = "dev2", userEmail = "dev2@example.com"),
						UserIdBean(userId = "c16d9741-65d2-4cec-a21a-01102e911889", userName = "dev3", userEmail = "dev3@example.com")
					),
					reviewId = "DEMO-CR-1001",
					reviewNumber = 1001,
					actor = UserIdBean(userId = "12e4492d-0b47-4d90-87f7-813e774cb4a3", userName = "dev2", userEmail = "dev2@example.com"),
					feedEventId = "1592482575648#demo#eb9af51d-c297-40e4-8f84-2ac6666b8a82",
					date = 1592482575648L
				),
				participant = UserIdBean(userId = "12e4492d-0b47-4d90-87f7-813e774cb4a3", userName = "dev2", userEmail = "dev2@example.com"),
				role = ParticipantRole.REVIEWER
			), webhook.data
		)
	}
}

internal fun WebhookParserTest.readResource(file: String): String {
	return this.javaClass.classLoader.getResource(file)?.readText(Charsets.UTF_8) ?: ""
}
