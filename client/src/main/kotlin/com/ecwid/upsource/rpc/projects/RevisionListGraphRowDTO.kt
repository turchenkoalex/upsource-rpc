package com.ecwid.upsource.rpc.projects

data class RevisionListGraphRowDTO(
	/**
	 * See RevisionListGraphNodeDTO parameters (repeated)
	 */
	val nodes: List<RevisionListGraphNodeDTO> = emptyList(),

	/**
	 * See RevisionListGraphEdgeDTO parameters (repeated)
	 */
	val edges: List<RevisionListGraphEdgeDTO> = emptyList()
)