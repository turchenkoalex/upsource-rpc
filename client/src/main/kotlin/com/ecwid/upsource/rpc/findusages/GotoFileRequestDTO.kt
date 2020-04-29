package com.ecwid.upsource.rpc.findusages

data class GotoFileRequestDTO(
	/**
	 * Project ID in Upsource (optional)
	 */
	val projectId: String?,

	/**
	 * ID of the revision (search in heads if not provided) (optional)
	 */
	val revisionId: String?,

	/**
	 * See ReviewIdDTO parameters (optional)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO?,

	/**
	 * Search query, e.g. part of the name (required)
	 */
	val pattern: String,

	/**
	 * Number of results to return (required)
	 */
	val limit: Int
)