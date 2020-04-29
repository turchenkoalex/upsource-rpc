package com.ecwid.upsource.rpc.projects

data class FileMergeInlineDiffRequestDTO(
	/**
	 * See FileInRevisionDTO parameters (required)
	 */
	val fileId: com.ecwid.upsource.rpc.FileInRevisionDTO,

	/**
	 * The source revision from which the branch originated (required)
	 */
	val sourceRevisionId: String,

	/**
	 * The base branch to compare against (required)
	 */
	val baseBranch: String,

	/**
	 * Type of change (see DiffTypeEnum) (required)
	 */
	val diffType: DiffTypeEnum,

	/**
	 * Whether to ignore whitespace changes (required)
	 */
	val ignoreWhitespace: Boolean,

	/**
	 * Number of context lines around the modified fragment (optional)
	 */
	val contextLines: Int?
)