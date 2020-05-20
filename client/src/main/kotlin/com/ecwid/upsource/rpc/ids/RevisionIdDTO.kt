package com.ecwid.upsource.rpc.ids

data class RevisionIdDTO(
	/**
	 * VCS revision ID (required)
	 */
	val revisionId: String
) {
	internal constructor() : this(
		revisionId = ""
	)
}
