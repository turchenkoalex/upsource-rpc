package com.ecwid.upsource.rpc.users

data class UserProjectInfoDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Unix timestamp of the last commit (required)
	 */
	val lastCommitTime: Long
) {
	internal constructor() : this(
		projectId = "",
		lastCommitTime = 0L
	)
}
