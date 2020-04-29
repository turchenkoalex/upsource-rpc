package com.ecwid.upsource.rpc.projects

data class ExampleComparison(
	/**
	 * The left location in the example (required)
	 */
	val leftLocator: String,

	/**
	 * The right location in the example (usually a default branch) (required)
	 */
	val rightLocator: String,

	/**
	 * The last commit time (required)
	 */
	val lastCommitTime: Long
)