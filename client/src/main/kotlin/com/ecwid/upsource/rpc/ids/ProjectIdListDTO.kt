package com.ecwid.upsource.rpc.ids

data class ProjectIdListDTO(
	/**
	 * Project ID in Upsource (repeated)
	 */
	val projectId: List<String> = emptyList()
)