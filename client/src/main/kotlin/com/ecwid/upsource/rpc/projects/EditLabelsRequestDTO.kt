package com.ecwid.upsource.rpc.projects

data class EditLabelsRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Discussion labels IDs (repeated)
	 */
	val labelId: List<String>
)