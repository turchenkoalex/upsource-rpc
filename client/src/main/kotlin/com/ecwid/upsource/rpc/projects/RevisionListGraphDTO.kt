package com.ecwid.upsource.rpc.projects

data class RevisionListGraphDTO(
	/**
	 * "Width" of a graph, i.e. how many branches running in parallel does it have (required)
	 */
	val width: Int,

	/**
	 * See RevisionListGraphRowDTO parameters (repeated)
	 */
	val rows: List<RevisionListGraphRowDTO> = emptyList()
) {
	internal constructor() : this(
		width = 0,
		rows = emptyList()
	)
}
