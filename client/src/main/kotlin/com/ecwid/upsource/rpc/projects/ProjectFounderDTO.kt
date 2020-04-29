package com.ecwid.upsource.rpc.projects

data class ProjectFounderDTO(
	/**
	 * User ID of the person who created the project (required)
	 */
	val userId: String,

	/**
	 * Unix timestamp of project creation (required)
	 */
	val date: Long
)