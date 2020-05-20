package com.ecwid.upsource.rpc.misc

data class ProjectWebhookTriggerDTO(
	/**
	 * Events to be notified of (repeated)
	 */
	val events: List<WebhookEventEnum> = emptyList(),

	/**
	 * URL targets for webhook requests (repeated)
	 */
	val urls: List<String> = emptyList()
)