package com.ecwid.upsource.rpc.projects

data class VcsRepoDTO(
	/**
	 * Repository ID (required)
	 */
	val id: String,

	/**
	 * Repository URL (repeated)
	 */
	val url: List<String>
)