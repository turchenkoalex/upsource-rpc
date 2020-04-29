package com.ecwid.upsource.rpc.projects

data class RevisionListGraphRowDTO(
	/**
	 * See RevisionListGraphNodeDTO parameters (repeated)
	 */
	val nodes: List<RevisionListGraphNodeDTO>,

	/**
	 * See RevisionListGraphEdgeDTO parameters (repeated)
	 */
	val edges: List<RevisionListGraphEdgeDTO>
)