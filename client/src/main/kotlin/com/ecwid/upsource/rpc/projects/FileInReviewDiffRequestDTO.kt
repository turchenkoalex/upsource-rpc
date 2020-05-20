package com.ecwid.upsource.rpc.projects

data class FileInReviewDiffRequestDTO(
	/**
	 * See FileInReviewDTO parameters (required)
	 */
	val file: FileInReviewDTO,

	/**
	 * Whether to ignore whitespace changes (required)
	 */
	val ignoreWhitespace: Boolean,

	/**
	 * See RevisionsSetDTO parameters (optional)
	 */
	val revisions: RevisionsSetDTO? = null,

	/**
	 * Whether to show the changes that were filtered out in the review diff. 'false' by default. (optional)
	 */
	val showUnrelatedChanges: Boolean? = null,

	/**
	 * Number of context lines around the modified fragment (optional)
	 */
	val contextLines: Int? = null
) {
	internal constructor() : this(
		file = FileInReviewDTO(),
		ignoreWhitespace = false,
		revisions = null,
		showUnrelatedChanges = null,
		contextLines = null
	)
}
