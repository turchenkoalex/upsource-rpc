// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param revisionId Revision info
 * @param score The confidence score
 */
@Suppress("unused")
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
	@Suppress("unused")
	internal constructor() : this(
		revisionId = "",
		score = 0.0
	)
}

