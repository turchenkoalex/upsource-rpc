package com.ecwid.upsource.rpc.users

data class UsersForReviewRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO,

	/**
	 * See RoleInReviewEnum parameters (required)
	 */
	val role: RoleInReviewEnum,

	/**
	 * Search query, e.g. part of the name (optional)
	 */
	val query: String?,

	/**
	 * Number of results to return (required)
	 */
	val limit: Int,

	/**
	 * Timeout(ms) to calculate smart users suggestion, by default - 1 minute (optional)
	 */
	val timeout: Long?
)