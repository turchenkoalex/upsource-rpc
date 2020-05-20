package com.ecwid.upsource.rpc.projects

data class InviteUserRequestDTO(
	/**
	 * ID of the Upsource project (required)
	 */
	val projectId: String,

	/**
	 * Email address of the Upsource user (required)
	 */
	val email: String
) {
	internal constructor() : this(
		projectId = "",
		email = ""
	)
}
