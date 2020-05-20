package com.ecwid.upsource.rpc.fileordirectorycontent

data class FileReferenceCodeMarkupDTO(
	/**
	 * See ReferenceCodeMarkupItemDTO parameters (repeated)
	 */
	val markup: List<ReferenceCodeMarkupItemDTO> = emptyList(),

	/**
	 * See MarkupNavigationPointDTO parameters (repeated)
	 */
	val navigationPointsTable: List<MarkupNavigationPointDTO> = emptyList(),

	/**
	 * See FileInRevisionDTO parameters (repeated)
	 */
	val fileNameTable: List<com.ecwid.upsource.rpc.ids.FileInRevisionDTO> = emptyList(),

	/**
	 * See LocalDeclarationRangeDTO parameters (repeated)
	 */
	val localDeclarationRanges: List<LocalDeclarationRangeDTO> = emptyList()
)