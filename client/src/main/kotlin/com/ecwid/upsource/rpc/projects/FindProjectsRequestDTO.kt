package com.ecwid.upsource.rpc.projects

data class FindProjectsRequestDTO(
	/**
	 * Search query, e.g. part of the name (required)
	 */
	val pattern: String,

	/**
	 * Number of projects to return (required)
	 */
	val limit: Int,

	/**
	 * Whether to search for the exact match (optional)
	 */
	val isExact: Boolean?
)