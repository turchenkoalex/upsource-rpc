package com.ecwid.upsource.rpc.projects

data class DiscussionsInProjectDTO(
	/**
	 * See DiscussionInFileDTO parameters (repeated)
	 */
	val discussions: List<DiscussionInFileDTO> = emptyList(),

	/**
	 * Whether all available items have been returned or more can be requested by passing the corresponding 'limit' value in the subsequent request (optional)
	 */
	val hasMore: Boolean? = null,

	/**
	 * Total number of discussions matching query (optional)
	 */
	val totalCount: Int? = null
)