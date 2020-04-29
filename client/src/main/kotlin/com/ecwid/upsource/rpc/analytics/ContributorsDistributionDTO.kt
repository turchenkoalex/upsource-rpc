package com.ecwid.upsource.rpc.analytics

data class ContributorsDistributionDTO(
	/**
	 * See CommitterTimeValue parameters (repeated)
	 */
	val items: List<CommitterTimeValue>,

	/**
	 * The specific time intervals that define the distribution (repeated)
	 */
	val timePoints: List<Long>,

	/**
	 * See CommitterUserInfo parameters (repeated)
	 */
	val users: List<CommitterUserInfo>
)