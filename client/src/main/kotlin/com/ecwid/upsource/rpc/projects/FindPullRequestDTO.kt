package com.ecwid.upsource.rpc.projects

data class FindPullRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Branch name (required)
	 */
	val branch: String
)