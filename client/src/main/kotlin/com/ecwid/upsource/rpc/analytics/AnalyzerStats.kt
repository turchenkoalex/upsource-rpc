package com.ecwid.upsource.rpc.analytics

data class AnalyzerStats(
	/**
	 * Unix timestamp of the earliest commit (required)
	 */
	val minCommitTime: Long,

	/**
	 * Unix timestamp of the latest commit (required)
	 */
	val maxCommitTime: Long,

	/**
	 * Total number of commits (required)
	 */
	val totalCommits: Int,

	/**
	 * Unix timestamp of the earliest indexed commit (required)
	 */
	val minIndexedCommitTime: Long,

	/**
	 * Unix timestamp of the latest indexed commit (required)
	 */
	val maxIndexedCommitTime: Long,

	/**
	 * Total number of indexed commits (required)
	 */
	val totalIndexedCommits: Int,

	/**
	 * Whether project model is known (required)
	 */
	val isProjectModelKnown: Boolean
) {
	internal constructor() : this(
		minCommitTime = 0L,
		maxCommitTime = 0L,
		totalCommits = 0,
		minIndexedCommitTime = 0L,
		maxIndexedCommitTime = 0L,
		totalIndexedCommits = 0,
		isProjectModelKnown = false
	)
}
