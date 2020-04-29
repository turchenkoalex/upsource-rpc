package com.ecwid.upsource.rpc.projects

data class FindCommitsResponseDTO(
	/**
	 * See FindCommitsResponseCommitsDTO parameters (repeated)
	 */
	val commits: List<FindCommitsResponseCommitsDTO>
)