package com.ecwid.upsource.rpc.analytics

data class ProjectCommittersDTO(
	/**
	 * See CommitterUserInfo parameters (repeated)
	 */
	val users: List<CommitterUserInfo> = emptyList()
)