package com.ecwid.upsource.rpc.misc

data class SetProjectWebhooksRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * List of webhook triggers (repeated)
	 */
	val triggers: List<ProjectWebhookTriggerDTO> = emptyList()
) {
	internal constructor() : this(
		projectId = "",
		triggers = emptyList()
	)
}
