package com.ecwid.upsource.rpc.misc

data class CheckCanCreateProjectResponseDTO(
	/**
	 * Whether the user has the right to create projects (required)
	 */
	val isAllowed: Boolean,

	/**
	 * Optional text message (optional)
	 */
	val message: String? = null
) {
	internal constructor() : this(
		isAllowed = false,
		message = null
	)
}
