package com.ecwid.upsource.rpc.projects

data class SuggestedReviewListDTO(
	val suggest: List<ReviewSuggestDTO> = emptyList()
)