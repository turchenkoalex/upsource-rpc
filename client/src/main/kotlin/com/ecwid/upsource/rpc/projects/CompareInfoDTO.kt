package com.ecwid.upsource.rpc.projects

data class CompareInfoDTO(
	/**
	 * Revision ID on the left hand side of the comparison (required)
	 */
	val leftRevisionId: String,

	/**
	 * Revision ID on the right hand side of the comparison (required)
	 */
	val rightRevisionId: String,

	/**
	 * The list of project head names for completion (repeated)
	 */
	val heads: List<String> = emptyList(),

	/**
	 * Number of commits that took place between the revisions (required)
	 */
	val commitsCount: Int,

	/**
	 * Number of files affected by these commits (required)
	 */
	val filesCount: Int,

	/**
	 * See ExampleComparison parameters (repeated)
	 */
	val examples: List<ExampleComparison> = emptyList(),

	/**
	 * See BranchingRevisionSuggestion parameters (optional)
	 */
	val suggestion: BranchingRevisionSuggestion? = null
) {
	internal constructor() : this(
		leftRevisionId = "",
		rightRevisionId = "",
		heads = emptyList(),
		commitsCount = 0,
		filesCount = 0,
		examples = emptyList(),
		suggestion = null
	)
}
