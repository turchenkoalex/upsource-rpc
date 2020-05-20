package com.ecwid.upsource.rpc.projects

data class FileHistoryItemDTO(
	/**
	 * Type of change (see DiffTypeEnum) (required)
	 */
	val diffType: DiffTypeEnum,

	/**
	 * See RevisionInfoDTO parameters (required)
	 */
	val revision: RevisionInfoDTO,

	/**
	 * A full path of the file starting with a slash (e.g. /folder/subfolder/file.txt ) (required)
	 */
	val fileName: String
) {
	internal constructor() : this(
		diffType = DiffTypeEnum.ADDED,
		revision = RevisionInfoDTO(),
		fileName = ""
	)
}
