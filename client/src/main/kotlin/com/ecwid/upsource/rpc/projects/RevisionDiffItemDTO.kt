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
	val newFile: com.ecwid.upsource.rpc.ids.FileInRevisionDTO,

	/**
	 * See FileInRevisionDTO parameters (optional)
	 */
	val oldFile: com.ecwid.upsource.rpc.ids.FileInRevisionDTO? = null,

	/**
	 * Indicates type of file (e.g. "file:xml") (optional)
	 */
	val fileIcon: String? = null,

	/**
	 * Whether the diff has been viewed by the user. When returned by the findCommits method, isRead is always set to 'true'. (required)
	 */
	val isRead: Boolean,

	/**
	 * When the diff relates to the merge result, holds the conflict type (see ConflictTypeEnum) (optional)
	 */
	val conflictType: ConflictTypeEnum? = null
) {
	internal constructor() : this(
		projectId = "",
		diffType = DiffTypeEnum.ADDED,
		newFile = com.ecwid.upsource.rpc.ids.FileInRevisionDTO(),
		oldFile = null,
		fileIcon = null,
		isRead = false,
		conflictType = null
	)
}
