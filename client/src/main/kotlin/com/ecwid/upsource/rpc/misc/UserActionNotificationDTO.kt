// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.misc

/**
 * @param userId User ID in Upsource
 */
@Suppress("unused")
data class UserActionNotificationDTO(
	/**
	 * User ID in Upsource (required)
	 */
	val userId: String
) {
	@Suppress("unused")
	internal constructor() : this(
		userId = ""
	)
}

