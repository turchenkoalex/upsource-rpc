// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.issuetrackers

/**
 * @param projectId Project ID in Upsource
 * @param reviewKey Review ID
 * @param fieldValue See IssueFieldValueIdDTO parameters
 */
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
	 * 
	 * @see com.ecwid.upsource.rpc.issuetrackers.IssueFieldValueIdDTO
	 */
	val fieldValue: List<IssueFieldValueIdDTO> = emptyList()
) {
	internal constructor() : this(
		projectId = "",
		reviewKey = "",
		fieldValue = emptyList()
	)
}
