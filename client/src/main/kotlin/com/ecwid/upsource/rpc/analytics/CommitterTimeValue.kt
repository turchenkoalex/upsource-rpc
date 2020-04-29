package com.ecwid.upsource.rpc.analytics

data class CommitterTimeValue(
	/**
	 * User ID of the committer (required)
	 */
	val committer: String,

	/**
	 * See TimeValue parameters (repeated)
	 */
	val items: List<TimeValue>
)