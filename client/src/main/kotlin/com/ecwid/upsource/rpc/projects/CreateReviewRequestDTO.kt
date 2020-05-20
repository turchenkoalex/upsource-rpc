package com.ecwid.upsource.rpc.projects

data class CreateReviewRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Review title (unused, left for compatibility with older clients) (optional)
	 */
	val title: String? = null,

	/**
	 * Revisions to attach (repeated)
	 */
	val revisions: List<String> = emptyList(),

	/**
	 * Branch name for branch review (optional)
	 */
	val branch: String? = null,

	/**
	 * Merge review: branch to merge from (optional)
	 */
	val mergeFromBranch: String? = null,

	/**
	 * Merge review: branch to merge into (optional)
	 */
	val mergeToBranch: String? = null
) {
	internal constructor() : this(
		projectId = "",
		title = null,
		revisions = emptyList(),
		branch = null,
		mergeFromBranch = null,
		mergeToBranch = null
	)
}
