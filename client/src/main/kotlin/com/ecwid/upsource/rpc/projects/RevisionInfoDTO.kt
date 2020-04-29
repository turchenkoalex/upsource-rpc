package com.ecwid.upsource.rpc.projects

data class RevisionInfoDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Upsource revision ID (may differ from VCS revision ID in case of a multi-root project) (required)
	 */
	val revisionId: String,

	/**
	 * Revision date (author date in case of Git which differentiates author and committer dates) (required)
	 */
	val revisionDate: Long,

	/**
	 * Revision date that agrees with graph topology (this means that child revisions will always have a larger effective date). In case of Git, can be equal to either author or committer date. (required)
	 */
	val effectiveRevisionDate: Long,

	/**
	 * Commit message of the revision (required)
	 */
	val revisionCommitMessage: String,

	/**
	 * Revision state: none(1), found(2), imported(3) (required)
	 */
	val state: RevisionStateEnum,

	/**
	 * The VCS revision ID (required)
	 */
	val vcsRevisionId: String,

	/**
	 * Short revision ID (required)
	 */
	val shortRevisionId: String,

	/**
	 * User ID of the commit's author (required)
	 */
	val authorId: String,

	/**
	 * See RevisionReachabilityEnum parameters (required)
	 */
	val reachability: RevisionReachabilityEnum,

	/**
	 * Revision tags, if any (repeated)
	 */
	val tags: List<String>,

	/**
	 * Branch head labels, if any (repeated)
	 */
	val branchHeadLabel: List<String>,

	/**
	 * List of parent revisions IDs (repeated)
	 */
	val parentRevisionIds: List<String>
)