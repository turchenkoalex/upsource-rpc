package com.ecwid.upsource.webhooks.jackson

internal data class WebhookData<Event>(
	val data: Event
)
