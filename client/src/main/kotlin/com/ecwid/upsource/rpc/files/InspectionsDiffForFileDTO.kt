package com.ecwid.upsource.rpc.files

data class InspectionsDiffForFileDTO(
	/**
	 * A full path to the file starting with a slash (e.g. /directory/file.txt) (required)
	 */
	val path: String,

	/**
	 * Introduced problems. See InspectionCodeMarkupItemDTO parameters (repeated)
	 */
	val introduced: List<InspectionCodeMarkupItemDTO>,

	/**
	 * Fixed problems. See InspectionCodeMarkupItemDTO parameters (repeated)
	 */
	val fixed: List<InspectionCodeMarkupItemDTO>,

	/**
	 * A list of ranges pointing to fixed problems in the original revision (repeated)
	 */
	val fixedOriginalRanges: List<com.ecwid.upsource.rpc.RangeDTO>
)