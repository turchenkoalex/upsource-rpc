// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param addedUsersCount How many users from the specified group were added
 */
@Suppress("unused")
data class AddGroupToReviewResponseDTO(
	/**
	 * How many users from the specified group were added (required)
	 */
	val addedUsersCount: Int
) {
	@Suppress("unused")
	internal constructor() : this(
		addedUsersCount = 0
	)
}

