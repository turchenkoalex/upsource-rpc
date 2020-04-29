package com.ecwid.upsource.rpc.issuetrackers

data class IssueTrackerProvidersListDTO(
	/**
	 * See IssueTrackerProviderDTO parameters (repeated)
	 */
	val providers: List<IssueTrackerProviderDTO>
)