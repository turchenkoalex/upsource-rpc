package com.ecwid.upsource.rpc.projects

data class RevisionsInReviewResponseDTO(
	/**
	 * See RevisionDescriptorListDTO parameters (required)
	 */
	val allRevisions: RevisionDescriptorListDTO,

	/**
	 * See RevisionsSetDTO parameters (required)
	 */
	val newRevisions: RevisionsSetDTO,

	/**
	 * The review contains revisions that are no longer found in VCS (due to a rebase operation, for example) (required)
	 */
	val hasMissingRevisions: Boolean,

	/**
	 * Indicates that revisions could have been squashed, meaning that the review can be squashed as well (required)
	 */
	val canSquash: Boolean,

	/**
	 * An optional field denoting that all revisions in a review are on a same branch (optional)
	 */
	val branchHint: String?,

	/**
	 * An optional field denoting that review can be converted to branch review (optional)
	 */
	val canTrackBranch: Boolean?,

	/**
	 * Internal (optional)
	 */
	val canCherryPickWithTeamCity: Boolean?
)