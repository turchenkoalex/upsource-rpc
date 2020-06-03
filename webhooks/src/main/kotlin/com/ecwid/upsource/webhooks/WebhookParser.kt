package com.ecwid.upsource.webhooks

import com.ecwid.upsource.webhooks.jackson.JacksonWebhookParser

interface WebhookParser {
	fun parse(data: String): Webhook

	companion object {
		fun newParser(): WebhookParser {
			return JacksonWebhookParser()
		}
	}
}
