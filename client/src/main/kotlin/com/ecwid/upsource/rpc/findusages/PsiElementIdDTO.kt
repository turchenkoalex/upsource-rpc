package com.ecwid.upsource.rpc.findusages

data class PsiElementIdDTO(
	/**
	 * See FileInRevisionDTO parameters (required)
	 */
	val fileId: com.ecwid.upsource.rpc.ids.FileInRevisionDTO,

	/**
	 * Text range of the given PSI element (required)
	 */
	val range: com.ecwid.upsource.rpc.ids.RangeDTO,

	/**
	 * Copy of the localIndex from 'ReferenceCodeMarkupItemDTO' to identify the exact PSI element (required)
	 */
	val localIndex: Int
) {
	internal constructor() : this(
		fileId = com.ecwid.upsource.rpc.ids.FileInRevisionDTO(),
		range = com.ecwid.upsource.rpc.ids.RangeDTO(),
		localIndex = 0
	)
}
