package com.ecwid.upsource.rpc.projects

data class ReviewStateChangedDTO(
	/**
	 * See ReviewStateEnum parameters (required)
	 */
	val oldState: ReviewStateEnum,

	/**
	 * See ReviewStateEnum parameters (required)
	 */
	val newState: ReviewStateEnum
)