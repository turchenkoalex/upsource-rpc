package com.ecwid.upsource.rpc.projects

data class ReviewSummaryChangesResponseDTO(
	/**
	 * See RevisionsDiffDTO parameters (optional)
	 */
	val diff: RevisionsDiffDTO?,

	/**
	 * Review annotation message, e.g. "Some revisions in review are not indexed yet", "Review has too many files" (optional)
	 */
	val annotation: String?,

	/**
	 * The list of files that were omitted in a review according to project settings (repeated)
	 */
	val ignoredFiles: List<String>,

	/**
	 * See FileDiffSummaryDTO parameters (repeated)
	 */
	val fileDiffSummary: List<FileDiffSummaryDTO>
)