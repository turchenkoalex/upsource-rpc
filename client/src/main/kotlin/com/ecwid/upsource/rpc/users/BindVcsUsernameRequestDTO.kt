package com.ecwid.upsource.rpc.users

data class BindVcsUsernameRequestDTO(
	/**
	 * User ID to register as an alias of the currently logged-in user (required)
	 */
	val userId: String
) {
	internal constructor() : this(
		userId = ""
	)
}
