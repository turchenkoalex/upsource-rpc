package com.ecwid.upsource.rpc.issuetrackers

data class IssueInfoDTO(
	/**
	 * Issue ID (required)
	 */
	val issueId: String,

	/**
	 * Issue URL (optional)
	 */
	val issueLink: String?,

	/**
	 * Issue summary (optional)
	 */
	val summary: String?,

	/**
	 * Whether the issue has been resolved (optional)
	 */
	val isResolved: Boolean?,

	/**
	 * HTML presentation of issue fields (Issue Type, Priority, State) (repeated)
	 */
	val field: List<String>
)