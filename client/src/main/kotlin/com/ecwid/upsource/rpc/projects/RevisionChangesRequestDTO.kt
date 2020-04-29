package com.ecwid.upsource.rpc.projects

data class RevisionChangesRequestDTO(
	/**
	 * See RevisionInProjectDTO parameters (required)
	 */
	val revision: com.ecwid.upsource.rpc.RevisionInProjectDTO,

	/**
	 * ID of the revision to compare with (optional)
	 */
	val compareToRevisionId: String?,

	/**
	 * How many files to return (required)
	 */
	val limit: Int,

	/**
	 * Number of files to skip from the top (for pagination) (optional)
	 */
	val skip: Int?
)