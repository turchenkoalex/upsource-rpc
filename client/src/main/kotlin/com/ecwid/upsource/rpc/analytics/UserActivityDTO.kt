// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.analytics

/**
 * @param items See TimeValue parameters
 * @param stats See AnalyzerStats parameters
 */
data class UserActivityDTO(
	/**
	 * See TimeValue parameters (repeated)
	 * 
	 * @see TimeValue
	 */
	val items: List<TimeValue> = emptyList(),

	/**
	 * See AnalyzerStats parameters (required)
	 * 
	 * @see AnalyzerStats
	 */
	val stats: AnalyzerStats
) {
	internal constructor() : this(
		items = emptyList(),
		stats = AnalyzerStats()
	)
}
