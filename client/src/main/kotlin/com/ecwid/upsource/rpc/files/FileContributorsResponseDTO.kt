package com.ecwid.upsource.rpc.files

data class FileContributorsResponseDTO(
	/**
	 * User IDs of the contributors (repeated)
	 */
	val authorIds: List<String>,

	/**
	 * Number of changes made to the file (repeated)
	 */
	val authoredChangesCounts: List<Int>,

	/**
	 * Number of reviews performed on the file (repeated)
	 */
	val reviewedChangesCounts: List<Int>,

	/**
	 * The major contributor to the file, if there is one (optional)
	 */
	val majorContributorUserId: String?
)