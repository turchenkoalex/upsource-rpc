// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.findusages

/**
 * @param ancestors The list of element's ancestors
 * @param inheritors The list of element's inheritors
 */
@Suppress("unused")
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
