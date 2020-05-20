package com.ecwid.upsource.rpc.projects

data class DiscussionsInFileDTO(
	/**
	 * See DiscussionInFileDTO parameters (repeated)
	 */
	val discussions: List<DiscussionInFileDTO> = emptyList()
)