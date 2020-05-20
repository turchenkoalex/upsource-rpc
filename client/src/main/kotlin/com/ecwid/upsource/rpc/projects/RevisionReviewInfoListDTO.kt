package com.ecwid.upsource.rpc.projects

data class RevisionReviewInfoListDTO(
	/**
	 * See RevisionReviewInfoDTO parameters (repeated)
	 */
	val reviewInfo: List<RevisionReviewInfoDTO> = emptyList()
)