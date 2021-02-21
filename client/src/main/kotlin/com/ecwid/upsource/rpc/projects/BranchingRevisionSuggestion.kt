// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param revisionId Revision ID to suggest
 * @param pathToLeftSize The number of revisions to the left locator
 * @param pathToRightSize The number of revisions to the right locator
 */
data class BranchingRevisionSuggestion(
	/**
	 * Revision ID to suggest (required)
	 */
	val revisionId: String,

	/**
	 * The number of revisions to the left locator (required)
	 */
	val pathToLeftSize: Int,

	/**
	 * The number of revisions to the right locator (required)
	 */
	val pathToRightSize: Int
) {
	@Suppress("unused")
	internal constructor() : this(
		revisionId = "",
		pathToLeftSize = 0,
		pathToRightSize = 0
	)
}
