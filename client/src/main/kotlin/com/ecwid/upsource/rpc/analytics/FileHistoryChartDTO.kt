// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.analytics

/**
 * @param maxAge Age of the oldest file on the chart (Unix timestamp)
 * @param maxEdits Number of edits for the most edited file on the chart
 * @param paths Full paths to the files starting with a slash (e.g. /directory/file.txt)
 * @param firstEdits Unix timestamps of first edits
 * @param frames See FileHistoryFrameDTO parameters
 */
data class FileHistoryChartDTO(
	/**
	 * Age of the oldest file on the chart (Unix timestamp) (required)
	 */
	val maxAge: Long,

	/**
	 * Number of edits for the most edited file on the chart (required)
	 */
	val maxEdits: Int,

	/**
	 * Full paths to the files starting with a slash (e.g. /directory/file.txt) (repeated)
	 */
	val paths: List<String> = emptyList(),

	/**
	 * Unix timestamps of first edits (repeated)
	 */
	val firstEdits: List<Long> = emptyList(),

	/**
	 * See FileHistoryFrameDTO parameters (repeated)
	 * 
	 * @see FileHistoryFrameDTO
	 */
	val frames: List<FileHistoryFrameDTO> = emptyList()
) {
	internal constructor() : this(
		maxAge = 0L,
		maxEdits = 0,
		paths = emptyList(),
		firstEdits = emptyList(),
		frames = emptyList()
	)
}
