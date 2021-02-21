// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.issuetrackers

/**
 * @param projectId Project ID in Upsource
 * @param discussionId ID of the discussion
 * @param fieldValue See IssueFieldValueIdDTO parameters
 */
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
	 * 
	 * @see com.ecwid.upsource.rpc.issuetrackers.IssueFieldValueIdDTO
	 */
	val fieldValue: List<IssueFieldValueIdDTO> = emptyList()
) {
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		discussionId = "",
		fieldValue = emptyList()
	)
}
