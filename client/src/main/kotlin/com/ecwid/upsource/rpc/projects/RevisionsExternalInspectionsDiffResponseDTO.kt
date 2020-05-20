package com.ecwid.upsource.rpc.projects

data class RevisionsExternalInspectionsDiffResponseDTO(
	/**
	 * See RevisionExternalInspectionsDiffResponseDTO (repeated)
	 */
	val diff: List<RevisionExternalInspectionsDiffResponseDTO> = emptyList()
)