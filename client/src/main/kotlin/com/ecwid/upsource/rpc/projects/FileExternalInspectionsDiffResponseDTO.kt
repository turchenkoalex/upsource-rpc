package com.ecwid.upsource.rpc.projects

data class FileExternalInspectionsDiffResponseDTO(
	/**
	 * Name of the file containing differing inspections (required)
	 */
	val fileId: String,

	/**
	 * Count of introduced problems (optional)
	 */
	val introduced: InspectionsCountDTO?,

	/**
	 * Count of fixed problems (optional)
	 */
	val fixed: InspectionsCountDTO?
)