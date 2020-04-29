package com.ecwid.upsource.rpc.projects

data class ProjectGroupDTO(
	/**
	 * Name of the Hub group (required)
	 */
	val name: String,

	/**
	 * Description of the Hub group (required)
	 */
	val description: String
)