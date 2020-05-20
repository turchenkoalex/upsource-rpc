package com.ecwid.upsource.rpc.issuetrackers

data class IssueInfoRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Issue ID (required)
	 */
	val issueId: IssueIdDTO
) {
	internal constructor() : this(
		projectId = "",
		issueId = IssueIdDTO()
	)
}
