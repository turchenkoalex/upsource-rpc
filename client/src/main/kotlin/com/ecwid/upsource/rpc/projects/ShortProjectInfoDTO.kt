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
	val headHash: String?,

	/**
	 * Whether project initialization is completed (required)
	 */
	val isReady: Boolean,

	/**
	 * Unix timestamp of the last commit (optional)
	 */
	val lastCommitDate: Long?,

	/**
	 * User ID of the last commit's author (optional)
	 */
	val lastCommitAuthorName: String?,

	/**
	 * URL of the project icon (optional)
	 */
	val iconUrl: String?,

	/**
	 * See ProjectGroupDTO parameters (optional)
	 */
	val group: ProjectGroupDTO?,

	/**
	 * Who and when created the project (optional)
	 */
	val founder: ProjectFounderDTO?,

	/**
	 * Number of commits made in the last 24 hours (optional)
	 */
	val lastDayCommits: Int?,

	/**
	 * Number of commits made in the last 30 days (optional)
	 */
	val lastMonthCommits: Int?,

	/**
	 * Total number of commits in the project (optional)
	 */
	val totalCommits: Int?,

	/**
	 * Whether the project is archived (optional)
	 */
	val isArchived: Boolean?
)