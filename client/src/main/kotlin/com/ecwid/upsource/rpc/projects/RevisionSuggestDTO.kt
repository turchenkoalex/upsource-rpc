package com.ecwid.upsource.rpc.projects

data class RevisionSuggestDTO(
	/**
	 * Revision info (required)
	 */
	val revisionId: String,

	/**
	 * The confidence score (required)
	 */
	val score: Double
) {
	internal constructor() : this(
		revisionId = "",
		score = 0.0
	)
}
