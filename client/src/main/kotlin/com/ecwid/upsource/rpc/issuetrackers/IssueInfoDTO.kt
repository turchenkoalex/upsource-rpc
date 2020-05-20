package com.ecwid.upsource.rpc.issuetrackers

data class IssueInfoDTO(
	/**
	 * Issue ID (required)
	 */
	val issueId: String,

	/**
	 * Issue URL (optional)
	 */
	val issueLink: String? = null,

	/**
	 * Issue summary (optional)
	 */
	val summary: String? = null,

	/**
	 * Whether the issue has been resolved (optional)
	 */
	val isResolved: Boolean? = null,

	/**
	 * HTML presentation of issue fields (Issue Type, Priority, State) (repeated)
	 */
	val field: List<String> = emptyList()
) {
	internal constructor() : this(
		issueId = "",
		issueLink = null,
		summary = null,
		isResolved = null,
		field = emptyList()
	)
}
