package com.ecwid.upsource.rpc.projects

data class FindCommitsRequestDTO(
	/**
	 * See FindCommitsRequestPatternDTO parameters (repeated)
	 */
	val commits: List<FindCommitsRequestPatternDTO> = emptyList(),

	/**
	 * Whether revision changes should be returned along with revision metadata (unused, left for compatibility with older clients) (optional)
	 */
	val requestChanges: Boolean? = null,

	/**
	 * Number of commits to return (optional)
	 */
	val limit: Int? = null
)