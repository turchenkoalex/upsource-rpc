package com.ecwid.upsource.rpc.projects

data class AddGroupToReviewResponseDTO(
	/**
	 * How many users from the specified group were added (required)
	 */
	val addedUsersCount: Int
)