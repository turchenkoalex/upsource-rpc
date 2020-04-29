package com.ecwid.upsource.rpc.users

data class UserGroupsListDTO(
	/**
	 * List of user groups (repeated)
	 */
	val groups: List<UserGroupDTO>,

	/**
	 * Whether there are more groups by the request beyond the limit specified (required)
	 */
	val hasMore: Boolean
)