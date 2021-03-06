// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.issuetrackers

/**
 * @param providerKey Issue tracker project key (JIRA, YouTrack)
 * @param scriptText Text of the issue tracker configuration script (must be a React component)
 * @param isAutoSetup Whether issue tracker integration can be set up automatically
 */
@Suppress("unused")
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
	@Suppress("unused")
	internal constructor() : this(
		providerKey = "",
		scriptText = "",
		isAutoSetup = false
	)
}

