package com.ecwid.upsource.rpc.projects

data class FileOwnershipSummaryDTO(
	/**
	 * A full path to the file starting with a slash (e.g. /directory/file.txt) (required)
	 */
	val filePath: String,

	/**
	 * See OwnershipSummaryEnum parameters (required)
	 */
	val state: OwnershipSummaryEnum,

	/**
	 * Upsource user ID (optional)
	 */
	val userId: String?
)