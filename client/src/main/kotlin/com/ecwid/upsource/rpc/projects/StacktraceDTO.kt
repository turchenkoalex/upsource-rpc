package com.ecwid.upsource.rpc.projects

data class StacktraceDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Stacktrace text to be analyzed (required)
	 */
	val stacktrace: String,

	/**
	 * VCS revision ID (optional)
	 */
	val revisionId: String?
)