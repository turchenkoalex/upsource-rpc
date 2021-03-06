// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.analytics

/**
 * @param revisionId Revision ID
 * @param description Commit message
 * @param time Unix timestamp of commit time
 * @param shortRevisionId Short revision ID
 */
@Suppress("unused")
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
	@Suppress("unused")
	internal constructor() : this(
		revisionId = "",
		description = "",
		time = 0L,
		shortRevisionId = ""
	)
}

