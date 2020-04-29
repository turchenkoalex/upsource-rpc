package com.ecwid.upsource.rpc.analytics

data class CommitsSummaryDTO(
	/**
	 * Total number of commits (required)
	 */
	val totalCommits: Int,

	/**
	 * Number of commits that didn't affect any module (required)
	 */
	val offsiteCommits: Int,

	/**
	 * Number of modules affected (required)
	 */
	val modulesTouched: Int
)