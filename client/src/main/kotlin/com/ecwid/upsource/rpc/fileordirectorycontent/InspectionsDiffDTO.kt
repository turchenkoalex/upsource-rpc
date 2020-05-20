package com.ecwid.upsource.rpc.fileordirectorycontent

data class InspectionsDiffDTO(
	/**
	 * See InspectionsDiffForFileDTO parameters (repeated)
	 */
	val diffForFile: List<InspectionsDiffForFileDTO> = emptyList()
)