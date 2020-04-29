package com.ecwid.upsource.rpc.files

data class GutterCodeMarkupItemDTO(
	/**
	 * See RangeDTO parameters (required)
	 */
	val range: com.ecwid.upsource.rpc.RangeDTO,

	/**
	 * See GutterMarkEnum parameters (repeated)
	 */
	val gutterMark: List<GutterMarkEnum>,

	/**
	 * Index in 'referenceMarkup' list this gutter mark corresponds to (required)
	 */
	val relatedSemanticMarkup: Int
)