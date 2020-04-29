package com.ecwid.upsource.rpc.files

data class InspectionsDiffDTO(
	/**
	 * See InspectionsDiffForFileDTO parameters (repeated)
	 */
	val diffForFile: List<InspectionsDiffForFileDTO>
)