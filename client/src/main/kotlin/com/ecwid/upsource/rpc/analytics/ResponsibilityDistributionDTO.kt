package com.ecwid.upsource.rpc.analytics

data class ResponsibilityDistributionDTO(
	/**
	 * See CommitterModuleValue parameters (repeated)
	 */
	val items: List<CommitterModuleValue>,

	/**
	 * See CommitterUserInfo parameters (repeated)
	 */
	val users: List<CommitterUserInfo>,

	/**
	 * Names of the project modules (repeated)
	 */
	val modules: List<String>,

	/**
	 * See AnalyzerStats parameters (required)
	 */
	val stats: AnalyzerStats
)