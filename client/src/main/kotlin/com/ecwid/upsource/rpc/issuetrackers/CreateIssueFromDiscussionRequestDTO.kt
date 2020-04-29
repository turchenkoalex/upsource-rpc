package com.ecwid.upsource.rpc.issuetrackers

data class CreateIssueFromDiscussionRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * ID of the discussion (required)
	 */
	val discussionId: String,

	/**
	 * See IssueFieldValueIdDTO parameters (repeated)
	 */
	val fieldValue: List<IssueFieldValueIdDTO>
)