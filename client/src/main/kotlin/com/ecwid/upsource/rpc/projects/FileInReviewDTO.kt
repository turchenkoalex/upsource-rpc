package com.ecwid.upsource.rpc.projects

data class FileInReviewDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO,

	/**
	 * See FileInRevisionDTO parameters (required)
	 */
	val file: com.ecwid.upsource.rpc.FileInRevisionDTO
)