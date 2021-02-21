// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.users

/**
 * @param reviewId See ReviewIdDTO parameters
 * @param role See RoleInReviewEnum parameters
 * @param query Search query, e.g. part of the name
 * @param limit Number of results to return
 * @param timeout Timeout(ms) to calculate smart users suggestion, by default - 1 minute
 */
data class UsersForReviewRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.ids.ReviewIdDTO
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * See RoleInReviewEnum parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.users.RoleInReviewEnum
	 */
	val role: RoleInReviewEnum,

	/**
	 * Search query, e.g. part of the name (optional)
	 */
	val query: String? = null,

	/**
	 * Number of results to return (required)
	 */
	val limit: Int,

	/**
	 * Timeout(ms) to calculate smart users suggestion, by default - 1 minute (optional)
	 */
	val timeout: Long? = null
) {
	@Suppress("unused")
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		role = RoleInReviewEnum.AUTHOR,
		query = null,
		limit = 0,
		timeout = null
	)
}
