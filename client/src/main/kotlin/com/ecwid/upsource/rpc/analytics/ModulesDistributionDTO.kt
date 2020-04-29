package com.ecwid.upsource.rpc.analytics

data class ModulesDistributionDTO(
	/**
	 * See ModuleTimeValue parameters (repeated)
	 */
	val items: List<ModuleTimeValue>,

	/**
	 * The specific time intervals that define the distribution (Unix timestamps) (repeated)
	 */
	val timePoints: List<Long>,

	/**
	 * Names of the project modules (repeated)
	 */
	val modules: List<String>
)