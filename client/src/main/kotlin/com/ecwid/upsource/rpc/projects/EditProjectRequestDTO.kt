// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param projectId Project ID in Upsource
 * @param settings See ProjectSettingsDTO parameters
 */
data class EditProjectRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * See ProjectSettingsDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.projects.ProjectSettingsDTO
	 */
	val settings: ProjectSettingsDTO
) {
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		settings = ProjectSettingsDTO()
	)
}
