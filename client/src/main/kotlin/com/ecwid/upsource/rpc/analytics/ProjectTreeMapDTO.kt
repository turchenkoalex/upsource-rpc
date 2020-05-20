package com.ecwid.upsource.rpc.analytics

data class ProjectTreeMapDTO(
	/**
	 * See ProjectTreeMapEntryDTO parameters (repeated)
	 */
	val entries: List<ProjectTreeMapEntryDTO> = emptyList()
)