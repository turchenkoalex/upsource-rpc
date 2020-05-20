package com.ecwid.upsource.rpc.projects

data class FileInReviewDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * See FileInRevisionDTO parameters (required)
	 */
	val file: com.ecwid.upsource.rpc.ids.FileInRevisionDTO
) {
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		file = com.ecwid.upsource.rpc.ids.FileInRevisionDTO()
	)
}
