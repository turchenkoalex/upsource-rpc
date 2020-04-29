package com.ecwid.upsource.rpc.projects

data class FileAnnotationResponseDTO(
	/**
	 * See FileAnnotationSectionDTO parameters (repeated)
	 */
	val retrospective: List<FileAnnotationSectionDTO>,

	/**
	 * See FileAnnotationSectionDTO parameters (repeated)
	 */
	val perspective: List<FileAnnotationSectionDTO>
)