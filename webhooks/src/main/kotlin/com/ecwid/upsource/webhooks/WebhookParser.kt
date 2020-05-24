package com.ecwid.upsource.webhooks

import com.ecwid.upsource.webhooks.jakson.JaksonWebhookParser

interface WebhookParser {
	fun parse(data: String): Webhook

	companion object {
		fun newParser(): WebhookParser {
			return JaksonWebhookParser()
		}
	}
}
