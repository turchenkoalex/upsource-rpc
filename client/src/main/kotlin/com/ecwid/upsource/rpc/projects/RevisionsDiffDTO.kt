package com.ecwid.upsource.rpc.projects

data class RevisionsDiffDTO(
	/**
	 * See RevisionDiffItemDTO parameters (repeated)
	 */
	val diff: List<RevisionDiffItemDTO>
)