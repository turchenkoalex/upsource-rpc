package com.ecwid.upsource.rpc.analytics

data class ReviewersGraphDTO(
	/**
	 * User IDs of graph nodes (repeated)
	 */
	val userIds: List<String> = emptyList(),

	/**
	 * Graph links (repeated)
	 */
	val links: List<ReviewersGraphLinkDTO> = emptyList()
)