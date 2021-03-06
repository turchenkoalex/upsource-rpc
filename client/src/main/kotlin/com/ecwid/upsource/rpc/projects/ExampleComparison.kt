// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param leftLocator The left location in the example
 * @param rightLocator The right location in the example (usually a default branch)
 * @param lastCommitTime The last commit time
 */
@Suppress("unused")
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
) {
	@Suppress("unused")
	internal constructor() : this(
		leftLocator = "",
		rightLocator = "",
		lastCommitTime = 0L
	)
}

