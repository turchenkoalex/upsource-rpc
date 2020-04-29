package com.ecwid.upsource.rpc.analytics

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
	val paths: List<String>,

	/**
	 * Unix timestamps of first edits (repeated)
	 */
	val firstEdits: List<Long>,

	/**
	 * See FileHistoryFrameDTO parameters (repeated)
	 */
	val frames: List<FileHistoryFrameDTO>
)