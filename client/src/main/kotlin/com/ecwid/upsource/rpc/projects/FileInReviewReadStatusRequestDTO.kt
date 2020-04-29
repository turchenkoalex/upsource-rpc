package com.ecwid.upsource.rpc.projects

data class FileInReviewReadStatusRequestDTO(
	/**
	 * See ReviewIdDTO parameters (required)
	 */
	val reviewId: com.ecwid.upsource.rpc.ReviewIdDTO,

	/**
	 * A full path to the file starting with a slash (e.g. /directory/file.txt) (required)
	 */
	val file: String,

	/**
	 * See RevisionsSetDTO parameters (required)
	 */
	val revisions: RevisionsSetDTO,

	/**
	 * Pass 'true' to mark the file as unread (optional)
	 */
	val markAsUnread: Boolean?
)