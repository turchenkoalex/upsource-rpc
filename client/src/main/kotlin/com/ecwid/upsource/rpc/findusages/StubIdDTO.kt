// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.findusages

/**
 * @param fileId See FileInRevisionDTO parameters
 * @param stubIndex Stub index ID
 */
data class StubIdDTO(
	/**
	 * See FileInRevisionDTO parameters (required)
	 * 
	 * @see com.ecwid.upsource.rpc.ids.FileInRevisionDTO
	 */
	val fileId: com.ecwid.upsource.rpc.ids.FileInRevisionDTO,

	/**
	 * Stub index ID (required)
	 */
	val stubIndex: Int
) {
	internal constructor() : this(
		fileId = com.ecwid.upsource.rpc.ids.FileInRevisionDTO(),
		stubIndex = 0
	)
}
