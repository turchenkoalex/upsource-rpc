package com.ecwid.upsource.rpc.issuetrackers

data class CreateIssueFromReviewRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Review ID (required)
	 */
	val reviewKey: String,

	/**
	 * See IssueFieldValueIdDTO parameters (repeated)
	 */
	val fieldValue: List<IssueFieldValueIdDTO>
)