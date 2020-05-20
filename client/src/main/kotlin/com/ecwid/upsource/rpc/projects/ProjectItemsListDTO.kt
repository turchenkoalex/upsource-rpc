package com.ecwid.upsource.rpc.projects

data class ProjectItemsListDTO(
	/**
	 * See ProjectTreeItemDTO parameters (repeated)
	 */
	val items: List<ProjectTreeItemDTO> = emptyList()
)