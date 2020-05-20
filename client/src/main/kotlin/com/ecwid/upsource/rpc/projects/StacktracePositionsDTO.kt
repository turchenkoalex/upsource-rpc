package com.ecwid.upsource.rpc.projects

data class StacktracePositionsDTO(
	/**
	 * See StacktracePositionDTO parameters (repeated)
	 */
	val positions: List<StacktracePositionDTO> = emptyList()
)