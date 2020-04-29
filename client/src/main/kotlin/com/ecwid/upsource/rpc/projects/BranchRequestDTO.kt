package com.ecwid.upsource.rpc.projects

data class BranchRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Branch name (required)
	 */
	val branch: String
)