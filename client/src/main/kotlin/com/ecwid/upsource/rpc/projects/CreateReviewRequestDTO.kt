package com.ecwid.upsource.rpc.projects

data class CreateReviewRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Review title (unused, left for compatibility with older clients) (optional)
	 */
	val title: String?,

	/**
	 * Revisions to attach (repeated)
	 */
	val revisions: List<String>,

	/**
	 * Branch name for branch review (optional)
	 */
	val branch: String?,

	/**
	 * Merge review: branch to merge from (optional)
	 */
	val mergeFromBranch: String?,

	/**
	 * Merge review: branch to merge into (optional)
	 */
	val mergeToBranch: String?
)