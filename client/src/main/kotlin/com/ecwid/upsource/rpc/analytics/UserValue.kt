package com.ecwid.upsource.rpc.analytics

data class UserValue(
	/**
	 * Upsource user ID (required)
	 */
	val userId: String,

	/**
	 * The value associated with the user ID (required)
	 */
	val value: Int
)