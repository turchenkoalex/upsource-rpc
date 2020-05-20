package com.ecwid.upsource.rpc.misc

data class CheckCanCreateProjectRequestDTO(
	/**
	 * Hub project ID (required)
	 */
	val hubProjectId: String
) {
	internal constructor() : this(
		hubProjectId = ""
	)
}
