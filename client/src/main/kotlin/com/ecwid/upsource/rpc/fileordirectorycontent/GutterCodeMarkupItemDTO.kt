package com.ecwid.upsource.rpc.fileordirectorycontent

data class GutterCodeMarkupItemDTO(
	/**
	 * See RangeDTO parameters (required)
	 */
	val range: com.ecwid.upsource.rpc.ids.RangeDTO,

	/**
	 * See GutterMarkEnum parameters (repeated)
	 */
	val gutterMark: List<GutterMarkEnum> = emptyList(),

	/**
	 * Index in 'referenceMarkup' list this gutter mark corresponds to (required)
	 */
	val relatedSemanticMarkup: Int
) {
	internal constructor() : this(
		range = com.ecwid.upsource.rpc.ids.RangeDTO(),
		gutterMark = emptyList(),
		relatedSemanticMarkup = 0
	)
}