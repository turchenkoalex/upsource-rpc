package com.ecwid.upsource.rpc.misc

data class UserActionNotificationDTO(
	/**
	 * User ID in Upsource (required)
	 */
	val userId: String
) {
	internal constructor() : this(
		userId = ""
	)
}
