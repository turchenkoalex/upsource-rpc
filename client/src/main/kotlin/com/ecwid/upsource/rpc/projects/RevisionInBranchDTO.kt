// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param revision See RevisionInfoDTO parameters
 * @param branch Branch name
 */
data class RevisionInBranchDTO(
	/**
	 * See RevisionInfoDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.projects.RevisionInfoDTO
	 */
	val revision: RevisionInfoDTO,

	/**
	 * Branch name (optional)
	 */
	val branch: String? = null
) {
	internal constructor() : this(
		revision = RevisionInfoDTO(),
		branch = null
	)
}
