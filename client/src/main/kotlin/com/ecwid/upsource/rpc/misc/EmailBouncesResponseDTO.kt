package com.ecwid.upsource.rpc.misc

data class EmailBouncesResponseDTO(
	/**
	 * Emails with either a "soft bounce" or a "hard bounce" status (repeated)
	 */
	val emails: List<String>
)