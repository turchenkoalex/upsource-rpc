package com.ecwid.upsource.rpc.projects

data class DiscussionsGroupDTO(
	/**
	 * Path to file (optional)
	 */
	val fileId: String? = null,

	/**
	 * Discussions contained in the file. See DiscussionsInFileDTO parameters (required)
	 */
	val discussions: DiscussionsInFileDTO
) {
	internal constructor() : this(
		fileId = null,
		discussions = DiscussionsInFileDTO()
	)
}
