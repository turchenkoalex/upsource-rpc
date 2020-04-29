package com.ecwid.upsource.rpc.projects

data class RevisionDiffItemDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * See DiffTypeEnum parameters (required)
	 */
	val diffType: DiffTypeEnum,

	/**
	 * See FileInRevisionDTO parameters (required)
	 */
	val newFile: com.ecwid.upsource.rpc.FileInRevisionDTO,

	/**
	 * See FileInRevisionDTO parameters (optional)
	 */
	val oldFile: com.ecwid.upsource.rpc.FileInRevisionDTO?,

	/**
	 * Indicates type of file (e.g. "file:xml") (optional)
	 */
	val fileIcon: String?,

	/**
	 * Whether the diff has been viewed by the user. When returned by the findCommits method, isRead is always set to 'true'. (required)
	 */
	val isRead: Boolean,

	/**
	 * When the diff relates to the merge result, holds the conflict type (see ConflictTypeEnum) (optional)
	 */
	val conflictType: ConflictTypeEnum?
)