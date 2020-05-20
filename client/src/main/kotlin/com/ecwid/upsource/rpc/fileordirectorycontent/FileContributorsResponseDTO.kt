package com.ecwid.upsource.rpc.fileordirectorycontent

data class FileContributorsResponseDTO(
	/**
	 * User IDs of the contributors (repeated)
	 */
	val authorIds: List<String> = emptyList(),

	/**
	 * Number of changes made to the file (repeated)
	 */
	val authoredChangesCounts: List<Int> = emptyList(),

	/**
	 * Number of reviews performed on the file (repeated)
	 */
	val reviewedChangesCounts: List<Int> = emptyList(),

	/**
	 * The major contributor to the file, if there is one (optional)
	 */
	val majorContributorUserId: String? = null
)