package com.ecwid.upsource.rpc.events

data class NewRevisionEventBean(
	/**
	 * Revision ID (required)
	 */
	val revisionId: String,

	/**
	 * List of branches (repeated)
	 */
	val branches: List<String> = emptyList(),

	/**
	 * Author ID (optional)
	 */
	val author: String? = null,

	/**
	 * Commit message (optional)
	 */
	val message: String? = null,

	/**
	 * Commit date (optional)
	 */
	val date: Long? = null
) {
	internal constructor() : this(
		revisionId = "",
		branches = emptyList(),
		author = null,
		message = null,
		date = null
	)
}