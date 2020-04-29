package com.ecwid.upsource.rpc.files

data class FileReferenceCodeMarkupDTO(
	/**
	 * See ReferenceCodeMarkupItemDTO parameters (repeated)
	 */
	val markup: List<ReferenceCodeMarkupItemDTO>,

	/**
	 * See MarkupNavigationPointDTO parameters (repeated)
	 */
	val navigationPointsTable: List<MarkupNavigationPointDTO>,

	/**
	 * See FileInRevisionDTO parameters (repeated)
	 */
	val fileNameTable: List<com.ecwid.upsource.rpc.FileInRevisionDTO>,

	/**
	 * See LocalDeclarationRangeDTO parameters (repeated)
	 */
	val localDeclarationRanges: List<LocalDeclarationRangeDTO>
)