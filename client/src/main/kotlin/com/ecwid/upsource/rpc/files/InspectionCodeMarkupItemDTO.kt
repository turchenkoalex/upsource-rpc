package com.ecwid.upsource.rpc.files

data class InspectionCodeMarkupItemDTO(
	/**
	 * See RangeDTO parameters (required)
	 */
	val range: com.ecwid.upsource.rpc.RangeDTO,

	/**
	 * See TextAttributeDTO parameters (required)
	 */
	val textAttribute: TextAttributeDTO,

	/**
	 * Inspection message (required)
	 */
	val message: String,

	/**
	 * See InspectionSeverityEnum parameters (required)
	 */
	val severity: InspectionSeverityEnum,

	/**
	 * Name (if any) of this markup key, given by IntelliJ IDEA (optional)
	 */
	val textAttributesKey: String?
)