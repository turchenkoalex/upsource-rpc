package com.ecwid.upsource.rpc.projects

data class EditProjectRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * See ProjectSettingsDTO parameters (required)
	 */
	val settings: ProjectSettingsDTO
)