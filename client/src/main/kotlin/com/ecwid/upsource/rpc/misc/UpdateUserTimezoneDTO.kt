package com.ecwid.upsource.rpc.misc

data class UpdateUserTimezoneDTO(
	/**
	 * User ID in Upsource (required)
	 */
	val userId: String,

	/**
	 * Timezone offset (required)
	 */
	val timezoneOffset: Int
) {
	internal constructor() : this(
		userId = "",
		timezoneOffset = 0
	)
}
