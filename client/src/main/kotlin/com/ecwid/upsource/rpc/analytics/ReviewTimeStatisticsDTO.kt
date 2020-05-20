package com.ecwid.upsource.rpc.analytics

data class ReviewTimeStatisticsDTO(
	/**
	 * Durations of review iterations, sorted in ascending order (repeated)
	 */
	val distribution: List<Long> = emptyList()
)