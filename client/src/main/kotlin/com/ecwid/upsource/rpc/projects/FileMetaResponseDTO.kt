// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param isUpToDate Whether the current revision is the latest
 * @param isDeleted Whether the file is deleted
 * @param isMerged Whether the file is merged into the default branch
 * @param lastModifiedRevision See RevisionInfoDTO parameters
 * @param isLastModifiedRevisionMerged Is last modified revision merged into the default branch
 * @param deletedInRevision See RevisionInfoDTO parameters
 * @param deletedInBranch Holds the branch in which the current file is deleted
 * @param modifiedInParallelBranches See RevisionInBranchDTO parameters
 * @param defaultBranch The default branch (null if not set)
 */
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
	 * 
	 * @see RevisionInfoDTO
	 */
	val lastModifiedRevision: RevisionInfoDTO,

	/**
	 * Is last modified revision merged into the default branch (required)
	 */
	val isLastModifiedRevisionMerged: Boolean,

	/**
	 * See RevisionInfoDTO parameters (optional)
	 * 
	 * @see RevisionInfoDTO
	 */
	val deletedInRevision: RevisionInfoDTO? = null,

	/**
	 * Holds the branch in which the current file is deleted (optional)
	 */
	val deletedInBranch: String? = null,

	/**
	 * See RevisionInBranchDTO parameters (repeated)
	 * 
	 * @see RevisionInBranchDTO
	 */
	val modifiedInParallelBranches: List<RevisionInBranchDTO> = emptyList(),

	/**
	 * The default branch (null if not set) (optional)
	 */
	val defaultBranch: String? = null
) {
	internal constructor() : this(
		isUpToDate = false,
		isDeleted = false,
		isMerged = false,
		lastModifiedRevision = RevisionInfoDTO(),
		isLastModifiedRevisionMerged = false,
		deletedInRevision = null,
		deletedInBranch = null,
		modifiedInParallelBranches = emptyList(),
		defaultBranch = null
	)
}
