package com.ecwid.upsource.rpc.findusages

data class StubIdDTO(
	/**
	 * See FileInRevisionDTO parameters (required)
	 */
	val fileId: com.ecwid.upsource.rpc.FileInRevisionDTO,

	/**
	 * Stub index ID (required)
	 */
	val stubIndex: Int
)