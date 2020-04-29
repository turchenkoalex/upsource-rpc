package com.ecwid.upsource.rpc.analytics

data class CommitterModuleValue(
	/**
	 * User ID of the committer (required)
	 */
	val committer: String,

	/**
	 * See ModuleValue parameters (repeated)
	 */
	val items: List<ModuleValue>
)