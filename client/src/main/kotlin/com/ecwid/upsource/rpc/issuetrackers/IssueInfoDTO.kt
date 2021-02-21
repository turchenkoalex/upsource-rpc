// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.issuetrackers

/**
 * @param issueId Issue ID
 * @param issueLink Issue URL
 * @param summary Issue summary
 * @param isResolved Whether the issue has been resolved
 * @param field HTML presentation of issue fields (Issue Type, Priority, State)
 */
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
	@Suppress("unused")
	internal constructor() : this(
		issueId = "",
		issueLink = null,
		summary = null,
		isResolved = null,
		field = emptyList()
	)
}
