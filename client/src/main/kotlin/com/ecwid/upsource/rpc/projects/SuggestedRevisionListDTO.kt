package com.ecwid.upsource.rpc.projects

data class SuggestedRevisionListDTO(
	val suggest: List<RevisionSuggestDTO> = emptyList()
)