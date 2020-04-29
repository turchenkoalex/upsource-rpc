package com.ecwid.upsource.rpc.projects

data class ParticipantProgressDTO(
	/**
	 * User ID of the review participant (required)
	 */
	val userId: String,

	/**
	 * Number of files that were viewed by the participant (required)
	 */
	val readFilesCount: Int,

	/**
	 * Unix timestamp of the last viewing (required)
	 */
	val lastSeenTimestamp: Long
)