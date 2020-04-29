package com.ecwid.upsource.rpc.analytics

data class TimeValue(
	/**
	 * Unix timestamp (required)
	 */
	val time: Long,

	/**
	 * The value associated with the timestamp (required)
	 */
	val value: Int
)