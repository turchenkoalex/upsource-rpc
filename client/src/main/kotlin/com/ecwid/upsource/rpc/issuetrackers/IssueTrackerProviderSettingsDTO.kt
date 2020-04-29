package com.ecwid.upsource.rpc.issuetrackers

data class IssueTrackerProviderSettingsDTO(
	/**
	 * Issue tracker provider key ("YouTrack", "JIRA") (required)
	 */
	val providerKey: String,

	/**
	 * Settings used to set up the integration (e.g server URL, login credentials, project ID in the issue tracker) (repeated)
	 */
	val settings: List<IssueTrackerProviderSettingDTO>
)