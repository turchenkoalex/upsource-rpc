package com.ecwid.upsource.rpc.findusages

data class StubIdDTO(
	/**
	 * See FileInRevisionDTO parameters (required)
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
