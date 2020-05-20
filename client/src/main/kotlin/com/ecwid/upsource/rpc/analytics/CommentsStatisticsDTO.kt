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
	val totalCounts: List<UserValue> = emptyList(),

	/**
	 * See UserValue parameters (repeated)
	 */
	val unlabeledCounts: List<UserValue> = emptyList(),

	/**
	 * See LabelStats parameters (repeated)
	 */
	val statsPerLabel: List<LabelStats> = emptyList()
) {
	internal constructor() : this(
		reviewComments = 0,
		totalComments = 0,
		totalCounts = emptyList(),
		unlabeledCounts = emptyList(),
		statsPerLabel = emptyList()
	)
}
