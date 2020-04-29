package com.ecwid.upsource.rpc.projects

data class ReactionDTO(
	/**
	 * ID of the reaction (required)
	 */
	val id: String,

	/**
	 * List of Upsource user IDs (repeated)
	 */
	val usersIds: List<String>
)