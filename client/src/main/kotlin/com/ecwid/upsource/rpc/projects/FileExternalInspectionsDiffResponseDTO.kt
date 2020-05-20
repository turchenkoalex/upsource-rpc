package com.ecwid.upsource.rpc.projects

data class FileExternalInspectionsDiffResponseDTO(
	/**
	 * Name of the file containing differing inspections (required)
	 */
	val fileId: String,

	/**
	 * Count of introduced problems (optional)
	 */
	val introduced: InspectionsCountDTO? = null,

	/**
	 * Count of fixed problems (optional)
	 */
	val fixed: InspectionsCountDTO? = null
) {
	internal constructor() : this(
		fileId = "",
		introduced = null,
		fixed = null
	)
}
