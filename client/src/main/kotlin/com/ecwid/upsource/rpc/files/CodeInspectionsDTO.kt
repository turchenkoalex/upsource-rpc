package com.ecwid.upsource.rpc.files

data class CodeInspectionsDTO(
	/**
	 * See InspectionCodeMarkupItemDTO parameters (repeated)
	 */
	val inspections: List<InspectionCodeMarkupItemDTO>,

	/**
	 * See FileWarningLevelEnum parameters (required)
	 */
	val fileLevel: FileWarningLevelEnum
)