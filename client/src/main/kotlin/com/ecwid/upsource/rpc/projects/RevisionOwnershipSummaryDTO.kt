package com.ecwid.upsource.rpc.projects

data class RevisionOwnershipSummaryDTO(
	/**
	 * VCS revision ID (required)
	 */
	val revisionId: String,

	/**
	 * Upsource user ID (required)
	 */
	val userId: String
) {
	internal constructor() : this(
		revisionId = "",
		userId = ""
	)
}
