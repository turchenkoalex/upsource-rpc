package com.ecwid.upsource.rpc.ids

data class ProjectIdDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String
) {
	internal constructor() : this(
		projectId = ""
	)
}
