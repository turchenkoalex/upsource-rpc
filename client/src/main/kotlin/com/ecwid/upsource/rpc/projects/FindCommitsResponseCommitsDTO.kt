package com.ecwid.upsource.rpc.projects

data class FindCommitsResponseCommitsDTO(
	/**
	 * See FindCommitsResponseCommitDTO parameters (repeated)
	 */
	val commits: List<FindCommitsResponseCommitDTO>
)