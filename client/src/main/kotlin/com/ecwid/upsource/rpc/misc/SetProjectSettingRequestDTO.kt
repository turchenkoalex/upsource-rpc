// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.misc

/**
 * @param projectId Project ID in Upsource
 * @param request See SetSettingRequestDTO parameters
 */
@Suppress("unused")
data class SetProjectSettingRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * See SetSettingRequestDTO parameters (required)
	 *
	 * @see com.ecwid.upsource.rpc.misc.SetSettingRequestDTO
	 */
	val request: SetSettingRequestDTO
) {
	@Suppress("unused")
	internal constructor() : this(
		projectId = "",
		request = SetSettingRequestDTO()
	)
}

