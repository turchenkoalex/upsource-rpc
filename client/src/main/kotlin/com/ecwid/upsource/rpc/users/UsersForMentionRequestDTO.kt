package com.ecwid.upsource.rpc.users

data class UsersForMentionRequestDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * ID of the Upsource review (optional)
	 */
	val reviewId: String?,

	/**
	 * ID of the revision (optional)
	 */
	val revisionId: String?,

	/**
	 * A full path to the file starting with a slash (e.g. /directory/file.txt) (optional)
	 */
	val fileName: String?,

	/**
	 * Search query, e.g. part of the name (optional)
	 */
	val query: String?,

	/**
	 * Number of results to return (required)
	 */
	val limit: Int
)