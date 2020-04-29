package com.ecwid.upsource.rpc.projects

data class DiscussionInFileWithFileDTO(
	/**
	 * VCS revision ID (optional)
	 */
	val revisionId: String?,

	/**
	 * A full path of the file starting with a slash (e.g. /folder/subfolder/file.txt ) (required)
	 */
	val fileName: String,

	/**
	 * See DiscussionInFileDTO parameters (required)
	 */
	val discussionInFile: DiscussionInFileDTO
)