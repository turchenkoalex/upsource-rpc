package com.ecwid.upsource.rpc.projects

data class CreateProjectRequestDTO(
	/**
	 * An ID of the new Upsource project (required)
	 */
	val newProjectId: String,

	/**
	 * See ProjectSettingsDTO parameters (required)
	 */
	val settings: ProjectSettingsDTO,

	/**
	 * Optional custom settings (repeated)
	 */
	val custom: List<com.ecwid.upsource.rpc.misc.SetSettingRequestDTO>
)