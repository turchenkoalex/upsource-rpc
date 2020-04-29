package com.ecwid.upsource.rpc.projects

data class DiscussionsGroupDTO(
	/**
	 * Path to file (optional)
	 */
	val fileId: String?,

	/**
	 * Discussions contained in the file. See DiscussionsInFileDTO parameters (required)
	 */
	val discussions: DiscussionsInFileDTO
)