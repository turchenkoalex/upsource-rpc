package com.ecwid.upsource.rpc.projects

data class RevisionInBranchDTO(
	/**
	 * See RevisionInfoDTO parameters (required)
	 */
	val revision: RevisionInfoDTO,

	/**
	 * Branch name (optional)
	 */
	val branch: String?
)