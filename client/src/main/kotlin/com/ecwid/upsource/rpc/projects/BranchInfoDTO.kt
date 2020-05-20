package com.ecwid.upsource.rpc.projects

data class BranchInfoDTO(
	/**
	 * Number of commits associated with the branch (required)
	 */
	val commitsCount: Int,

	/**
	 * Number of files affected by the branch commits (required)
	 */
	val filesCount: Int,

	/**
	 * Revision where the branching took place (required)
	 */
	val branchingRevision: String,

	/**
	 * Latest revision in the branch. See RevisionInfoDTO parameters (required)
	 */
	val headRevision: RevisionInfoDTO,

	/**
	 * See ReviewDescriptorDTO parameters (optional)
	 */
	val reviewInfo: ReviewDescriptorDTO? = null,

	/**
	 * A branch review can be created. See CanCreateBranchReviewDTO parameters. (required)
	 */
	val canCreateReview: CanCreateBranchReviewDTO,

	/**
	 * See BranchStatsDTO parameters (required)
	 */
	val stats: BranchStatsDTO,

	/**
	 * See BranchMergeInfoDTO parameters (required)
	 */
	val mergeInfo: BranchMergeInfoDTO,

	/**
	 * Whether the branch is a pull request (required)
	 */
	val isPullRequest: Boolean
) {
	internal constructor() : this(
		commitsCount = 0,
		filesCount = 0,
		branchingRevision = "",
		headRevision = RevisionInfoDTO(),
		reviewInfo = null,
		canCreateReview = CanCreateBranchReviewDTO(),
		stats = BranchStatsDTO(),
		mergeInfo = BranchMergeInfoDTO(),
		isPullRequest = false
	)
}
