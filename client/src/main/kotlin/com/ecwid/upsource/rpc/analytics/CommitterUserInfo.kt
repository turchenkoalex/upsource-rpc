package com.ecwid.upsource.rpc.analytics

data class CommitterUserInfo(
	/**
	 * VCS committer name (required)
	 */
	val committer: String,

	/**
	 * User ID of the committer (required)
	 */
	val userId: String
)