package com.ecwid.upsource.rpc.projects

data class LabelsListDTO(
	/**
	 * Indicates if predefined labels are hidden (required)
	 */
	val hidePredefinedLabels: Boolean,

	/**
	 * Predefined discussion labels. See LabelDTO parameters (repeated)
	 */
	val predefinedLabels: List<LabelDTO>,

	/**
	 * Custom discussion labels. See LabelDTO parameters (repeated)
	 */
	val customLabels: List<LabelDTO>
)