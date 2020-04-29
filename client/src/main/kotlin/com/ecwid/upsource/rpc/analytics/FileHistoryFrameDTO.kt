package com.ecwid.upsource.rpc.analytics

data class FileHistoryFrameDTO(
	/**
	 * Unix timestamp of the frame (required)
	 */
	val timestamp: Long,

	/**
	 * Counts of file edits since the previous frame (repeated)
	 */
	val deltas: List<Int>
)