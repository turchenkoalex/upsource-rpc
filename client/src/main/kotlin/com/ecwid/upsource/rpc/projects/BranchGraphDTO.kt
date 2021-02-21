// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param revisions See RevisionInfoDTO parameters
 * @param graph See RevisionListGraphDTO parameters
 */
data class BranchGraphDTO(
	/**
	 * See RevisionInfoDTO parameters (repeated)
	 * 
	 * @see com.ecwid.upsource.rpc.projects.RevisionInfoDTO
	 */
	val revisions: List<RevisionInfoDTO> = emptyList(),

	/**
	 * See RevisionListGraphDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.projects.RevisionListGraphDTO
	 */
	val graph: RevisionListGraphDTO
) {
	internal constructor() : this(
		revisions = emptyList(),
		graph = RevisionListGraphDTO()
	)
}
