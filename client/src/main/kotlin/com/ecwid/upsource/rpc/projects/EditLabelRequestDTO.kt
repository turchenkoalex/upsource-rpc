package com.ecwid.upsource.rpc.projects

data class EditLabelRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * See LabelDTO parameters (required)
	 */
	val label: LabelDTO
) {
	internal constructor() : this(
		projectId = "",
		label = LabelDTO()
	)
}
