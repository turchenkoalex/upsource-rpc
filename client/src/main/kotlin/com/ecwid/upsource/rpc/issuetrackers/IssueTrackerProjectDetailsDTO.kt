package com.ecwid.upsource.rpc.issuetrackers

data class IssueTrackerProjectDetailsDTO(
	/**
	 * Issue tracker provider key ("YouTrack", "JIRA") (required)
	 */
	val providerKey: String,

	/**
	 * Issue tracker project URL (required)
	 */
	val projectUrl: String,

	/**
	 * See IssueFieldDTO parameters (repeated)
	 */
	val field: List<IssueFieldDTO>,

	/**
	 * Whether an issue can be created (required)
	 */
	val canCreateIssue: Boolean,

	/**
	 * See IssueRequiredFieldDTO parameters (repeated)
	 */
	val requiredField: List<IssueRequiredFieldDTO>
)