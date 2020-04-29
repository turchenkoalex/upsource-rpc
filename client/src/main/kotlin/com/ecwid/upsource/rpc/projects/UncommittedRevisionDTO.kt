package com.ecwid.upsource.rpc.projects

data class UncommittedRevisionDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Parent revision ID (required)
	 */
	val parentRevisionId: String,

	/**
	 * List of modified files (added, deleted, updated) (repeated)
	 */
	val files: List<String>
)