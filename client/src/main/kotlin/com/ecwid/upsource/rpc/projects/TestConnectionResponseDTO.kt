package com.ecwid.upsource.rpc.projects

data class TestConnectionResponseDTO(
	/**
	 * See TestConnectionStatusEnum parameters (required)
	 */
	val status: TestConnectionStatusEnum,

	/**
	 * Response message (optional)
	 */
	val message: String?
)