package com.ecwid.upsource.rpc.projects

data class RevisionBranchesResponseDTO(
	/**
	 * Branches containing the given revision (repeated)
	 */
	val branchName: List<String>
)