// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.findusages

/**
 * @param oldRevisionId ID of the old revision
 * @param newRevisionId ID of the new revision
 * @param usages See UsagesDiffDTO parameters
 */
data class UsagesDiffResponseDTO(
	/**
	 * ID of the old revision (required)
	 */
	val oldRevisionId: String,

	/**
	 * ID of the new revision (required)
	 */
	val newRevisionId: String,

	/**
	 * See UsagesDiffDTO parameters (repeated)
	 * 
	 * @see com.ecwid.upsource.rpc.findusages.UsagesDiffDTO
	 */
	val usages: List<UsagesDiffDTO> = emptyList()
) {
	@Suppress("unused")
	internal constructor() : this(
		oldRevisionId = "",
		newRevisionId = "",
		usages = emptyList()
	)
}
