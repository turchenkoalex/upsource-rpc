// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.analytics

/**
 * @param committer VCS committer name
 * @param userId User ID of the committer
 */
data class CommitterUserInfo(
	/**
	 * VCS committer name (required)
	 */
	val committer: String,

	/**
	 * User ID of the committer (required)
	 */
	val userId: String
) {
	@Suppress("unused")
	internal constructor() : this(
		committer = "",
		userId = ""
	)
}
