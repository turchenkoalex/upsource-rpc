package com.ecwid.upsource.rpc.issuetrackers

data class IssueFieldDTO(
	/**
	 * Field ID (required)
	 */
	val id: String,

	/**
	 * Field name. The following fields are recognized for JIRA: url, linkUrl, projectId, login, password, pkcs12cert, pkcs12pass, enableCreateIssue, enableReviewComment, wfc_reviewCreated, wfc_reviewAccepted, wfc_reviewRejected, wfc_reviewClosed. YouTrack configuration in Upsource is delegated to Hub. (required)
	 */
	val name: String,

	/**
	 * Default value (optional)
	 */
	val defaultValueId: String?,

	/**
	 * See IssueFieldValueDTO parameters (repeated)
	 */
	val value: List<IssueFieldValueDTO>
)