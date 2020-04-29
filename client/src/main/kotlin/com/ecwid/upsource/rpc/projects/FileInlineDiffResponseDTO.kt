package com.ecwid.upsource.rpc.projects

data class FileInlineDiffResponseDTO(
	/**
	 * Whether file contents are identical in both revisions (required)
	 */
	val isIdentical: Boolean,

	/**
	 * Text of the diff (required)
	 */
	val text: String,

	/**
	 * See FileInRevisionDTO parameters (optional)
	 */
	val oldFile: com.ecwid.upsource.rpc.FileInRevisionDTO?,

	/**
	 * See FileInRevisionDTO parameters (optional)
	 */
	val newFile: com.ecwid.upsource.rpc.FileInRevisionDTO?,

	/**
	 * See FileContentTypeDTO parameters (required)
	 */
	val contentType: com.ecwid.upsource.rpc.files.FileContentTypeDTO,

	/**
	 * How many lines were added (repeated)
	 */
	val addedLines: List<Int>,

	/**
	 * How many lines were removed (repeated)
	 */
	val removedLines: List<Int>,

	/**
	 * How many lines were modified (repeated)
	 */
	val modifiedLines: List<Int>,

	/**
	 * Ranges of collapsed text (lines) (repeated)
	 */
	val collapsedLines: List<com.ecwid.upsource.rpc.RangeDTO>,

	/**
	 * Ranges of text that were added (repeated)
	 */
	val addedRanges: List<com.ecwid.upsource.rpc.RangeDTO>,

	/**
	 * Ranges of text that were removed (repeated)
	 */
	val removedRanges: List<com.ecwid.upsource.rpc.RangeDTO>,

	/**
	 * Determines if syntax markup is supported for this file type (optional)
	 */
	val isSyntaxSupported: Boolean?,

	/**
	 * See TextMarkupDTO parameters (repeated)
	 */
	val syntaxMarkup: List<com.ecwid.upsource.rpc.files.TextMarkupDTO>,

	/**
	 * A mapping of diff ranges to ranges in the old document (repeated)
	 */
	val diffToOldDocument: List<RangeMappingDTO>,

	/**
	 * A mapping of diff ranges to ranges in the new document (repeated)
	 */
	val diffToNewDocument: List<RangeMappingDTO>,

	/**
	 * Line numbers as they appear in the old file (repeated)
	 */
	val oldLineNumbers: List<Int>,

	/**
	 * Line numbers as they appear in the new file (repeated)
	 */
	val newLineNumbers: List<Int>,

	/**
	 * Authors of code fragments in the review diff (repeated)
	 */
	val annotation: List<FileAnnotationSectionDTO>,

	/**
	 * Some changes were filtered out (in the review diff) (optional)
	 */
	val hasUnrelatedChanges: Boolean?,

	/**
	 * When the diff relates to the merge result, holds the conflict type (see ConflictTypeEnum) (optional)
	 */
	val conflictType: ConflictTypeEnum?
)