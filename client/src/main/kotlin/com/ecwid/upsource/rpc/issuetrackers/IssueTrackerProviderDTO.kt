package com.ecwid.upsource.rpc.issuetrackers

data class IssueTrackerProviderDTO(
	/**
	 * Issue tracker project key (JIRA, YouTrack) (required)
	 */
	val providerKey: String,

	/**
	 * Text of the issue tracker configuration script (must be a React component) (required)
	 */
	val scriptText: String,

	/**
	 * Whether issue tracker integration can be set up automatically (required)
	 */
	val isAutoSetup: Boolean
) {
	internal constructor() : this(
		providerKey = "",
		scriptText = "",
		isAutoSetup = false
	)
}
