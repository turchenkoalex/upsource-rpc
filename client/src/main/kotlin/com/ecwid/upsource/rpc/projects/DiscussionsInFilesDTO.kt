package com.ecwid.upsource.rpc.projects

data class DiscussionsInFilesDTO(
	/**
	 * See DiscussionInFileWithFileDTO parameters (repeated)
	 */
	val discussions: List<DiscussionInFileWithFileDTO> = emptyList()
)