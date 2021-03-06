// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.analytics

/**
 * @param items See CommitterTimeValue parameters
 * @param timePoints The specific time intervals that define the distribution
 * @param users See CommitterUserInfo parameters
 */
@Suppress("unused")
data class ContributorsDistributionDTO(
	/**
	 * See CommitterTimeValue parameters (repeated)
	 *
	 * @see com.ecwid.upsource.rpc.analytics.CommitterTimeValue
	 */
	val items: List<CommitterTimeValue> = emptyList(),

	/**
	 * The specific time intervals that define the distribution (repeated)
	 */
	val timePoints: List<Long> = emptyList(),

	/**
	 * See CommitterUserInfo parameters (repeated)
	 *
	 * @see com.ecwid.upsource.rpc.analytics.CommitterUserInfo
	 */
	val users: List<CommitterUserInfo> = emptyList()
)
