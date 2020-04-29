package com.ecwid.upsource.rpc.analytics

data class CommitsDetailsDTO(
	/**
	 * See CommitInfo parameters (repeated)
	 */
	val commits: List<CommitInfo>
)