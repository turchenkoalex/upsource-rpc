package com.ecwid.upsource.rpc.findusages

data class TextSearchItem(
	/**
	 * The file in a particular project and revision (required)
	 */
	val file: com.ecwid.upsource.rpc.FileInRevisionDTO,

	/**
	 * See RevisionInfoDTO parameters (required)
	 */
	val revisionInfo: com.ecwid.upsource.rpc.projects.RevisionInfoDTO,

	/**
	 * File content type (required)
	 */
	val contentType: com.ecwid.upsource.rpc.files.FileContentTypeDTO,

	/**
	 * Whether this file is deleted (required)
	 */
	val isDeleted: Boolean,

	/**
	 * Project details (required)
	 */
	val projectDetails: TextSearchProjectDetails,

	/**
	 * Code snippets (repeated)
	 */
	val snippets: List<TextSearchSnippet>,

	/**
	 * Total number of matches in the file (required)
	 */
	val totalMatches: Int
)