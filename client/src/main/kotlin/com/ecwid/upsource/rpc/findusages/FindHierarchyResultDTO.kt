package com.ecwid.upsource.rpc.findusages

data class FindHierarchyResultDTO(
	/**
	 * The list of element's ancestors (repeated)
	 */
	val ancestors: List<NavigationTargetItemDTO> = emptyList(),

	/**
	 * The list of element's inheritors (repeated)
	 */
	val inheritors: List<NavigationTargetItemDTO> = emptyList()
)