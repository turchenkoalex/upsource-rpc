package com.ecwid.upsource.rpc.projects

data class BranchStatsDTO(
	/**
	 * The branch from which the given branch originated; null if the given branch is a default one or the only branch in the repository (optional)
	 */
	val parentBranch: String? = null,

	/**
	 * How many commits ahead of the parent branch; 0 for a default branch (required)
	 */
	val commitsAhead: Int,

	/**
	 * How many commits behind the parent branch; 0 for a default branch (required)
	 */
	val commitsBehind: Int
) {
	internal constructor() : this(
		parentBranch = null,
		commitsAhead = 0,
		commitsBehind = 0
	)
}
