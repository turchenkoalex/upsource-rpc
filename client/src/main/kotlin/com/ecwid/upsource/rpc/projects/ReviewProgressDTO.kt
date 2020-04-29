package com.ecwid.upsource.rpc.projects

data class ReviewProgressDTO(
	/**
	 * Individual progress for each participant (repeated)
	 */
	val participants: List<ParticipantProgressDTO>,

	/**
	 * Total number of files in review (required)
	 */
	val totalFiles: Int
)