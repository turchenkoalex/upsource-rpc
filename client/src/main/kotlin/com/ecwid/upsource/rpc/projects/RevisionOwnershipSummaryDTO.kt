// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param revisionId VCS revision ID
 * @param userId Upsource user ID
 */
data class RevisionOwnershipSummaryDTO(
	/**
	 * VCS revision ID (required)
	 */
	val revisionId: String,

	/**
	 * Upsource user ID (required)
	 */
	val userId: String
) {
	internal constructor() : this(
		revisionId = "",
		userId = ""
	)
}
