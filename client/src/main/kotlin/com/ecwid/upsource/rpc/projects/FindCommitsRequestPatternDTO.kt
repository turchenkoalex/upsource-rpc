package com.ecwid.upsource.rpc.projects

data class FindCommitsRequestPatternDTO(
	/**
	 * VCS revision ID (optional)
	 */
	val revisionId: String?,

	/**
	 * Project ID in Upsource (optional)
	 */
	val projectId: String?,

	/**
	 * A fragment of the commit message used as a search query (optional)
	 */
	val messageFragment: String?,

	/**
	 * Name of the commit author (optional)
	 */
	val author: String?,

	/**
	 * Unix timestamp of the commit (optional)
	 */
	val commitTime: Long?
)