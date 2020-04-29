package com.ecwid.upsource.rpc.projects

data class RevisionListGraphNodeDTO(
	/**
	 * Node position index (required)
	 */
	val position: Int,

	/**
	 * Node color (required)
	 */
	val color: Int
)