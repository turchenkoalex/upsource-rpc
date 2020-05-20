package com.ecwid.upsource.rpc.projects

data class HidePredefinedLabelsRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Whether to show or hide predefined labels (required)
	 */
	val doHide: Boolean
) {
	internal constructor() : this(
		projectId = "",
		doHide = false
	)
}
