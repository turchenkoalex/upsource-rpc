package com.ecwid.upsource.rpc.analytics

data class ReviewTimeStatisticsRequestDTO(
	/**
	 * Upsource user ID (required)
	 */
	val userId: String
) {
	internal constructor() : this(
		userId = ""
	)
}
