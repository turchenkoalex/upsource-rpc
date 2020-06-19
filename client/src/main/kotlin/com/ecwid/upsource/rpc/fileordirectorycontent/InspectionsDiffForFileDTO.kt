// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.fileordirectorycontent

/**
 * @param path A full path to the file starting with a slash (e.g. /directory/file.txt)
 * @param introduced Introduced problems. See InspectionCodeMarkupItemDTO parameters
 * @param fixed Fixed problems. See InspectionCodeMarkupItemDTO parameters
 * @param fixedOriginalRanges A list of ranges pointing to fixed problems in the original revision
 */
data class InspectionsDiffForFileDTO(
	/**
	 * A full path to the file starting with a slash (e.g. /directory/file.txt) (required)
	 */
	val path: String,

	/**
	 * Introduced problems. See InspectionCodeMarkupItemDTO parameters (repeated)
	 * 
	 * @see InspectionCodeMarkupItemDTO
	 */
	val introduced: List<InspectionCodeMarkupItemDTO> = emptyList(),

	/**
	 * Fixed problems. See InspectionCodeMarkupItemDTO parameters (repeated)
	 * 
	 * @see InspectionCodeMarkupItemDTO
	 */
	val fixed: List<InspectionCodeMarkupItemDTO> = emptyList(),

	/**
	 * A list of ranges pointing to fixed problems in the original revision (repeated)
	 */
	val fixedOriginalRanges: List<com.ecwid.upsource.rpc.ids.RangeDTO> = emptyList()
) {
	internal constructor() : this(
		path = "",
		introduced = emptyList(),
		fixed = emptyList(),
		fixedOriginalRanges = emptyList()
	)
}
