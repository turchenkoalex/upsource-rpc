// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param nodes See RevisionListGraphNodeDTO parameters
 * @param edges See RevisionListGraphEdgeDTO parameters
 */
data class RevisionListGraphRowDTO(
	/**
	 * See RevisionListGraphNodeDTO parameters (repeated)
	 * 
	 * @see com.ecwid.upsource.rpc.projects.RevisionListGraphNodeDTO
	 */
	val nodes: List<RevisionListGraphNodeDTO> = emptyList(),

	/**
	 * See RevisionListGraphEdgeDTO parameters (repeated)
	 * 
	 * @see com.ecwid.upsource.rpc.projects.RevisionListGraphEdgeDTO
	 */
	val edges: List<RevisionListGraphEdgeDTO> = emptyList()
)