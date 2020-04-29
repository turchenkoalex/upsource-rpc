package com.ecwid.upsource.rpc.projects

data class RevisionsListRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Number of revisions to return (required)
	 */
	val limit: Int,

	/**
	 * Number of revisions to skip from the top (for pagination) (optional)
	 */
	val skip: Int?,

	/**
	 * Whether revision graph should be returned (optional)
	 */
	val requestGraph: Boolean?
)