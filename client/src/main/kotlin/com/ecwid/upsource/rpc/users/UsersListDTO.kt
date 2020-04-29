package com.ecwid.upsource.rpc.users

data class UsersListDTO(
	/**
	 * User ID of the logged-in user (optional)
	 */
	val me: String?,

	/**
	 * User IDs of suggested users (repeated)
	 */
	val suggestedUsers: List<String>,

	/**
	 * Users' relevance [0..100] as a reviewer (repeated)
	 */
	val suggestedUserRelevance: List<Int>,

	/**
	 * The number of open reviews the user has (repeated)
	 */
	val suggestedUserOpenedReviews: List<Int>,

	/**
	 * User IDs of suggested committers (repeated)
	 */
	val committers: List<String>,

	/**
	 * User IDs of other suggested participants (repeated)
	 */
	val others: List<String>,

	/**
	 * Whether all available items have been returned or more can be requested by passing the corresponding 'limit' value in the subsequent request (required)
	 */
	val hasMore: Boolean
)