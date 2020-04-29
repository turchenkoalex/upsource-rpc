package com.ecwid.upsource.rpc.projects

data class RangeMappingDTO(
	/**
	 * Starting line number (required)
	 */
	val from: com.ecwid.upsource.rpc.RangeDTO,

	/**
	 * Ending line number (required)
	 */
	val to: com.ecwid.upsource.rpc.RangeDTO
)