package com.ecwid.upsource.rpc.findusages

data class FindHierarchyResultDTO(
	/**
	 * The list of element's ancestors (repeated)
	 */
	val ancestors: List<NavigationTargetItemDTO>,

	/**
	 * The list of element's inheritors (repeated)
	 */
	val inheritors: List<NavigationTargetItemDTO>
)