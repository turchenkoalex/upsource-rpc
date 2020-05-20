package com.ecwid.upsource.rpc.projects

data class ShortProjectInfoDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Project name (required)
	 */
	val projectName: String,

	/**
	 * Head revision ID (optional)
	 */
	val headHash: String? = null,

	/**
	 * Whether project initialization is completed (required)
	 */
	val isReady: Boolean,

	/**
	 * Unix timestamp of the last commit (optional)
	 */
	val lastCommitDate: Long? = null,

	/**
	 * User ID of the last commit's author (optional)
	 */
	val lastCommitAuthorName: String? = null,

	/**
	 * URL of the project icon (optional)
	 */
	val iconUrl: String? = null,

	/**
	 * See ProjectGroupDTO parameters (optional)
	 */
	val group: ProjectGroupDTO? = null,

	/**
	 * Who and when created the project (optional)
	 */
	val founder: ProjectFounderDTO? = null,

	/**
	 * Number of commits made in the last 24 hours (optional)
	 */
	val lastDayCommits: Int? = null,

	/**
	 * Number of commits made in the last 30 days (optional)
	 */
	val lastMonthCommits: Int? = null,

	/**
	 * Total number of commits in the project (optional)
	 */
	val totalCommits: Int? = null,

	/**
	 * Whether the project is archived (optional)
	 */
	val isArchived: Boolean? = null
) {
	internal constructor() : this(
		projectId = "",
		projectName = "",
		headHash = null,
		isReady = false,
		lastCommitDate = null,
		lastCommitAuthorName = null,
		iconUrl = null,
		group = null,
		founder = null,
		lastDayCommits = null,
		lastMonthCommits = null,
		totalCommits = null,
		isArchived = null
	)
}
