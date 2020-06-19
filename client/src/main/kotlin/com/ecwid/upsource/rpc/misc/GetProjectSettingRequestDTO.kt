// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.misc

/**
 * @param projectId Project ID in Upsource
 * @param request See GetSettingRequestDTO parameters
 */
data class GetProjectSettingRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * See GetSettingRequestDTO parameters (required)
	 * 
	 * @see GetSettingRequestDTO
	 */
	val request: GetSettingRequestDTO
) {
	internal constructor() : this(
		projectId = "",
		request = GetSettingRequestDTO()
	)
}
