// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param supportedVcs VCS types supported by the Upsource instance
 */
@Suppress("unused")
data class ProjectConfigurationResponseDTO(
	/**
	 * VCS types supported by the Upsource instance (repeated)
	 */
	val supportedVcs: List<String> = emptyList()
)
