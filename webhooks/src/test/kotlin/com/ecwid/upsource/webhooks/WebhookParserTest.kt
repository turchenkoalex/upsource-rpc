package com.ecwid.upsource.webhooks

import com.ecwid.upsource.rpc.events.NewRevisionEventBean
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class WebhookParserTest {
	private val parser = WebhookParser.newParser()

	@Test
	fun parseTest() {
		val data = readResource("newRevisionEventBean.json")
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
}

internal fun WebhookParserTest.readResource(file: String): String {
	return this.javaClass.classLoader.getResource(file).readText(Charsets.UTF_8)
}
