// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param reviewId See ReviewIdDTO parameters
 * @param file A full path to the file starting with a slash (e.g. /directory/file.txt)
 * @param revisions See RevisionsSetDTO parameters
 * @param markAsUnread Pass 'true' to mark the file as unread
 */
data class FileInReviewReadStatusRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 * 
	 * @see ReviewIdDTO
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO,

	/**
	 * A full path to the file starting with a slash (e.g. /directory/file.txt) (required)
	 */
	val file: String,

	/**
	 * See RevisionsSetDTO parameters (required)
	 * 
	 * @see RevisionsSetDTO
	 */
	val revisions: RevisionsSetDTO,

	/**
	 * Pass 'true' to mark the file as unread (optional)
	 */
	val markAsUnread: Boolean? = null
) {
	internal constructor() : this(
		reviewId = com.ecwid.upsource.rpc.ids.ReviewIdDTO(),
		file = "",
		revisions = RevisionsSetDTO(),
		markAsUnread = null
	)
}
