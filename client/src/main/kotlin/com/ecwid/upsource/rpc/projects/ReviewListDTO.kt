package com.ecwid.upsource.rpc.projects

data class ReviewListDTO(
	/**
	 * See ReviewDescriptorDTO parameters (repeated)
	 */
	val reviews: List<ReviewDescriptorDTO>,

	/**
	 * Whether all available items have been returned or more can be requested by passing the corresponding 'limit' value in the subsequent request (required)
	 */
	val hasMore: Boolean,

	/**
	 * Total number of reviews (required)
	 */
	val totalCount: Int
)