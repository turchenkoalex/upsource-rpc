package com.ecwid.upsource.rpc.projects

data class BranchMergeInfoDTO(
	/**
	 * The list of files that are changed in both: given branch and base branch (repeated)
	 */
	val mergeFiles: List<String>
)