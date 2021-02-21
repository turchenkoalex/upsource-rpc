// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.analytics

/**
 * @param items See TimeValue parameters
 * @param stats See AnalyzerStats parameters
 */
@Suppress("unused")
data class UserActivityDTO(
	/**
	 * See TimeValue parameters (repeated)
	 * 
	 * @see com.ecwid.upsource.rpc.analytics.TimeValue
	 */
	val items: List<TimeValue> = emptyList(),

	/**
	 * See AnalyzerStats parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.analytics.AnalyzerStats
	 */
	val stats: AnalyzerStats
) {
	@Suppress("unused")
	internal constructor() : this(
		items = emptyList(),
		stats = AnalyzerStats()
	)
}

