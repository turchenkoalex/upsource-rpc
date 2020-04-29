package com.ecwid.upsource.rpc.files

data class FilePsiResponseDTO(
	/**
	 * Whether the code model is available for a file (optional)
	 */
	val hasPsi: Boolean?,

	/**
	 * PSI status message, e.g. a failure to provide code intelligence or another message regarding the file in general (optional)
	 */
	val psiStatusMessage: String?,

	/**
	 * See FileReferenceCodeMarkupDTO parameters (optional)
	 */
	val referenceMarkup: FileReferenceCodeMarkupDTO?,

	/**
	 * See FileTextMarkupDTO parameters (optional)
	 */
	val textMarkup: FileTextMarkupDTO?,

	/**
	 * See GutterCodeMarkupsDTO parameters (optional)
	 */
	val gutterMarks: GutterCodeMarkupsDTO?,

	/**
	 * See CodeInspectionsDTO parameters (optional)
	 */
	val inspections: CodeInspectionsDTO?,

	/**
	 * External inspections (repeated)
	 */
	val externalInspections: List<InspectionCodeMarkupItemDTO>
)