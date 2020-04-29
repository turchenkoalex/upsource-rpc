package com.ecwid.upsource.rpc.analytics

data class CommentsStatisticsDTO(
	/**
	 * Number of review comments (required)
	 */
	val reviewComments: Int,

	/**
	 * Total number of comments (required)
	 */
	val totalComments: Int,

	/**
	 * See UserValue parameters (repeated)
	 */
	val totalCounts: List<UserValue>,

	/**
	 * See UserValue parameters (repeated)
	 */
	val unlabeledCounts: List<UserValue>,

	/**
	 * See LabelStats parameters (repeated)
	 */
	val statsPerLabel: List<LabelStats>
)