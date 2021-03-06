// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.users

/**
 * @param me User ID of the logged-in user
 * @param suggestedUsers User IDs of suggested users
 * @param suggestedUserRelevance Users' relevance [0..100] as a reviewer
 * @param suggestedUserOpenedReviews The number of open reviews the user has
 * @param committers User IDs of suggested committers
 * @param others User IDs of other suggested participants
 * @param hasMore Whether all available items have been returned or more can be requested by passing the corresponding 'limit' value in the subsequent request
 */
@Suppress("unused")
data class UsersListDTO(
	/**
	 * User ID of the logged-in user (optional)
	 */
	val me: String? = null,

	/**
	 * User IDs of suggested users (repeated)
	 */
	val suggestedUsers: List<String> = emptyList(),

	/**
	 * Users' relevance [0..100] as a reviewer (repeated)
	 */
	val suggestedUserRelevance: List<Int> = emptyList(),

	/**
	 * The number of open reviews the user has (repeated)
	 */
	val suggestedUserOpenedReviews: List<Int> = emptyList(),

	/**
	 * User IDs of suggested committers (repeated)
	 */
	val committers: List<String> = emptyList(),

	/**
	 * User IDs of other suggested participants (repeated)
	 */
	val others: List<String> = emptyList(),

	/**
	 * Whether all available items have been returned or more can be requested by passing the corresponding 'limit' value in the subsequent request (required)
	 */
	val hasMore: Boolean
) {
	@Suppress("unused")
	internal constructor() : this(
		me = null,
		suggestedUsers = emptyList(),
		suggestedUserRelevance = emptyList(),
		suggestedUserOpenedReviews = emptyList(),
		committers = emptyList(),
		others = emptyList(),
		hasMore = false
	)
}

