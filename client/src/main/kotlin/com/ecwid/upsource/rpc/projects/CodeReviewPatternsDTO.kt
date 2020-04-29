package com.ecwid.upsource.rpc.projects

data class CodeReviewPatternsDTO(
	/**
	 * See CodeReviewPattern (repeated)
	 */
	val patterns: List<CodeReviewPattern>
)