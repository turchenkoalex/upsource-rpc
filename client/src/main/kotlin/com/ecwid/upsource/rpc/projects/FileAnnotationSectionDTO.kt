package com.ecwid.upsource.rpc.projects

data class FileAnnotationSectionDTO(
	/**
	 * Line number to start with (required)
	 */
	val startLine: Int,

	/**
	 * How many lines (required)
	 */
	val lineCount: Int,

	/**
	 * See RevisionInfoDTO parameters (required)
	 */
	val revision: RevisionInfoDTO,

	/**
	 * A full path to the file starting with a slash (e.g. /directory/file.txt) (required)
	 */
	val filePath: String,

	/**
	 * A reference to the prior revision of this section (only revision and file, but not the line number / line count) (optional)
	 */
	val priorChangeAnnotation: FileAnnotationSectionDTO?
)