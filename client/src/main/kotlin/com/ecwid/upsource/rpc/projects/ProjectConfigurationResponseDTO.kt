package com.ecwid.upsource.rpc.projects

data class ProjectConfigurationResponseDTO(
	/**
	 * VCS types supported by the Upsource instance (repeated)
	 */
	val supportedVcs: List<String> = emptyList()
)