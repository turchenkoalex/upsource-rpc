package com.ecwid.upsource.rpc.fileordirectorycontent

data class InspectionCodeMarkupItemDTO(
	/**
	 * See RangeDTO parameters (required)
	 */
	val range: com.ecwid.upsource.rpc.ids.RangeDTO,

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
	val textAttributesKey: String? = null
) {
	internal constructor() : this(
		range = com.ecwid.upsource.rpc.ids.RangeDTO(),
		textAttribute = TextAttributeDTO(),
		message = "",
		severity = InspectionSeverityEnum.INFORMATION,
		textAttributesKey = null
	)
}