package com.ecwid.upsource.rpc.projects

data class FileMetaResponseDTO(
	/**
	 * Whether the current revision is the latest (required)
	 */
	val isUpToDate: Boolean,

	/**
	 * Whether the file is deleted (required)
	 */
	val isDeleted: Boolean,

	/**
	 * Whether the file is merged into the default branch (required)
	 */
	val isMerged: Boolean,

	/**
	 * See RevisionInfoDTO parameters (required)
	 */
	val lastModifiedRevision: RevisionInfoDTO,

	/**
	 * Is last modified revision merged into the default branch (required)
	 */
	val isLastModifiedRevisionMerged: Boolean,

	/**
	 * See RevisionInfoDTO parameters (optional)
	 */
	val deletedInRevision: RevisionInfoDTO?,

	/**
	 * Holds the branch in which the current file is deleted (optional)
	 */
	val deletedInBranch: String?,

	/**
	 * See RevisionInBranchDTO parameters (repeated)
	 */
	val modifiedInParallelBranches: List<RevisionInBranchDTO>,

	/**
	 * The default branch (null if not set) (optional)
	 */
	val defaultBranch: String?
)