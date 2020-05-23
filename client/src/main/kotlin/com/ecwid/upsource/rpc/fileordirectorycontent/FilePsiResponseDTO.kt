package com.ecwid.upsource.rpc.fileordirectorycontent

data class FilePsiResponseDTO(
	/**
	 * Whether the code model is available for a file (optional)
	 */
	val hasPsi: Boolean? = null,

	/**
	 * PSI status message, e.g. a failure to provide code intelligence or another message regarding the file in general (optional)
	 */
	val psiStatusMessage: String? = null,

	/**
	 * See FileReferenceCodeMarkupDTO parameters (optional)
	 */
	val referenceMarkup: FileReferenceCodeMarkupDTO? = null,

	/**
	 * See FileTextMarkupDTO parameters (optional)
	 */
	val textMarkup: FileTextMarkupDTO? = null,

	/**
	 * See GutterCodeMarkupsDTO parameters (optional)
	 */
	val gutterMarks: GutterCodeMarkupsDTO? = null,

	/**
	 * See CodeInspectionsDTO parameters (optional)
	 */
	val inspections: CodeInspectionsDTO? = null,

	/**
	 * External inspections (repeated)
	 */
	val externalInspections: List<InspectionCodeMarkupItemDTO> = emptyList()
)