package com.ecwid.upsource.rpc.analytics

data class ReviewersGraphDTO(
	/**
	 * User IDs of graph nodes (repeated)
	 */
	val userIds: List<String>,

	/**
	 * Graph links (repeated)
	 */
	val links: List<ReviewersGraphLinkDTO>
)