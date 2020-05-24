package com.ecwid.upsource.rpc.events

data class MergedToDefaultBranchEventBean(
	/**
	 * Number of commits merged (required)
	 */
	val commitsCount: Int,

	/**
	 * List of merged branches (repeated)
	 */
	val branches: List<String> = emptyList()
) {
	internal constructor() : this(
		commitsCount = 0,
		branches = emptyList()
	)
}
