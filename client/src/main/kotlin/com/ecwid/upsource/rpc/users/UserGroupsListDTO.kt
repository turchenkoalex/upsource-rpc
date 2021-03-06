// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.users

/**
 * @param groups List of user groups
 * @param hasMore Whether there are more groups by the request beyond the limit specified
 */
@Suppress("unused")
data class UserGroupsListDTO(
	/**
	 * List of user groups (repeated)
	 */
	val groups: List<UserGroupDTO> = emptyList(),

	/**
	 * Whether there are more groups by the request beyond the limit specified (required)
	 */
	val hasMore: Boolean
) {
	@Suppress("unused")
	internal constructor() : this(
		groups = emptyList(),
		hasMore = false
	)
}

