package com.ecwid.upsource.rpc.projects

data class ProjectReadmeResponseDTO(
	/**
	 * Text of the README file (required)
	 */
	val text: String,

	/**
	 * A full path to the README file starting with a slash (e.g. /directory/readme.txt) (required)
	 */
	val fileName: String,

	/**
	 * Revision ID (required)
	 */
	val revisionId: String
)