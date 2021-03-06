// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.findusages

/**
 * @param projectId Project ID in Upsource
 * @param revisionId ID of the revision (search in heads if not provided)
 * @param reviewId See ReviewIdDTO parameters
 * @param pattern Search query, e.g. part of the name
 * @param limit Number of results to return
 */
@Suppress("unused")
data class GotoFileRequestDTO(
	/**
	 * Project ID in Upsource (optional)
	 */
	val projectId: String? = null,

	/**
	 * ID of the revision (search in heads if not provided) (optional)
	 */
	val revisionId: String? = null,

	/**
	 * See ReviewIdDTO parameters (optional)
	 *
	 * @see com.ecwid.upsource.rpc.ids.ReviewIdDTO
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO? = null,

	/**
	 * Search query, e.g. part of the name (required)
	 */
	val pattern: String,

	/**
	 * Number of results to return (required)
	 */
	val limit: Int
) {
	@Suppress("unused")
	internal constructor() : this(
		projectId = null,
		revisionId = null,
		reviewId = null,
		pattern = "",
		limit = 0
	)
}

