// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param mergeFiles The list of files that are changed in both: given branch and base branch
 */
data class BranchMergeInfoDTO(
	/**
	 * The list of files that are changed in both: given branch and base branch (repeated)
	 */
	val mergeFiles: List<String> = emptyList()
)