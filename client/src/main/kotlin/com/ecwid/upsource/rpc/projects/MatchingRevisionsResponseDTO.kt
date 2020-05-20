package com.ecwid.upsource.rpc.projects

data class MatchingRevisionsResponseDTO(
	/**
	 * See RevisionInfoDTO parameters (repeated)
	 */
	val revision: List<RevisionInfoDTO> = emptyList()
)