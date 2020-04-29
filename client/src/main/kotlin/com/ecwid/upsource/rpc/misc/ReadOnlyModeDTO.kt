package com.ecwid.upsource.rpc.misc

data class ReadOnlyModeDTO(
	/**
	 * Whether the server is in read-only mode (required)
	 */
	val isReadOnly: Boolean,

	/**
	 * Describes the reason for enabling read-only mode (if any) (optional)
	 */
	val description: String?
)