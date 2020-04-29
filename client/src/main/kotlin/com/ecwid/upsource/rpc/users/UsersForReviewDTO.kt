package com.ecwid.upsource.rpc.users

data class UsersForReviewDTO(
	/**
	 * Suggested reviewers for a given review (required)
	 */
	val result: UsersListDTO,

	/**
	 * All relevant users (repeated)
	 */
	val relevantUser: List<String>,

	/**
	 * Users' relevance [0..100] (repeated)
	 */
	val userRelevance: List<Int>
)