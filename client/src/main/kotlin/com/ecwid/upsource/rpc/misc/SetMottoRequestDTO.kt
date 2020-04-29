package com.ecwid.upsource.rpc.misc

data class SetMottoRequestDTO(
	/**
	 * Server motto text (leave empty to remove an existing one) (optional)
	 */
	val motto: String?
)