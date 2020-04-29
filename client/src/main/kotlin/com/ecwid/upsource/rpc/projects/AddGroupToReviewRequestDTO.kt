package com.ecwid.upsource.rpc.projects

data class AddGroupToReviewRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO,

	/**
	 * ID of a user group (required)
	 */
	val groupId: String,

	/**
	 * Role of users getting assigned. See RoleInReviewEnum parameters (required)
	 */
	val role: com.ecwid.upsource.rpc.users.RoleInReviewEnum
)