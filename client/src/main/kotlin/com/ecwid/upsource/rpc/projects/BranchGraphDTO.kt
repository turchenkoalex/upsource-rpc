package com.ecwid.upsource.rpc.projects

data class BranchGraphDTO(
	/**
	 * See RevisionInfoDTO parameters (repeated)
	 */
	val revisions: List<RevisionInfoDTO>,

	/**
	 * See RevisionListGraphDTO parameters (required)
	 */
	val graph: RevisionListGraphDTO
)