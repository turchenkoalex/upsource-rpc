package com.ecwid.upsource.rpc.analytics

data class UserActivityDTO(
	/**
	 * See TimeValue parameters (repeated)
	 */
	val items: List<TimeValue>,

	/**
	 * See AnalyzerStats parameters (required)
	 */
	val stats: AnalyzerStats
)