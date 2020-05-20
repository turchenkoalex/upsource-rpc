package com.ecwid.upsource.rpc.analytics

data class CommitInfo(
	/**
	 * Revision ID (required)
	 */
	val revisionId: String,

	/**
	 * Commit message (required)
	 */
	val description: String,

	/**
	 * Unix timestamp of commit time (required)
	 */
	val time: Long,

	/**
	 * Short revision ID (required)
	 */
	val shortRevisionId: String
) {
	internal constructor() : this(
		revisionId = "",
		description = "",
		time = 0L,
		shortRevisionId = ""
	)
}
