package com.ecwid.upsource.rpc.analytics

data class ProjectActivityDTO(
	/**
	 * See TimeValue parameters (repeated)
	 */
	val items: List<TimeValue>,

	/**
	 * Names of project modules (repeated)
	 */
	val modules: List<String>,

	/**
	 * See AnalyzerStats parameters (required)
	 */
	val stats: AnalyzerStats
)