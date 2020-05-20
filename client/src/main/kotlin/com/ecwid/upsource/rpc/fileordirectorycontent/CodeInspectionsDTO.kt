package com.ecwid.upsource.rpc.fileordirectorycontent

data class CodeInspectionsDTO(
	/**
	 * See InspectionCodeMarkupItemDTO parameters (repeated)
	 */
	val inspections: List<InspectionCodeMarkupItemDTO> = emptyList(),

	/**
	 * See FileWarningLevelEnum parameters (required)
	 */
	val fileLevel: FileWarningLevelEnum
) {
	internal constructor() : this(
		inspections = emptyList(),
		fileLevel = FileWarningLevelEnum.NONE
	)
}
