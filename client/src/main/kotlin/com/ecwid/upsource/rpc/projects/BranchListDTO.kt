// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param branch See BranchDTO parameters
 * @param hasMore Whether all available items have been returned or more can be requested by passing the corresponding 'limit' value in the subsequent request
 * @param totalBranches How many branches
 * @param defaultBranch Name of the default branch
 * @param isDefaultBranchExists Whether the project has the default branch
 */
data class BranchListDTO(
	/**
	 * See BranchDTO parameters (repeated)
	 * 
	 * @see BranchDTO
	 */
	val branch: List<BranchDTO> = emptyList(),

	/**
	 * Whether all available items have been returned or more can be requested by passing the corresponding 'limit' value in the subsequent request (required)
	 */
	val hasMore: Boolean,

	/**
	 * How many branches (required)
	 */
	val totalBranches: Int,

	/**
	 * Name of the default branch (optional)
	 */
	val defaultBranch: String? = null,

	/**
	 * Whether the project has the default branch (optional)
	 */
	val isDefaultBranchExists: Boolean? = null
) {
	internal constructor() : this(
		branch = emptyList(),
		hasMore = false,
		totalBranches = 0,
		defaultBranch = null,
		isDefaultBranchExists = null
	)
}
