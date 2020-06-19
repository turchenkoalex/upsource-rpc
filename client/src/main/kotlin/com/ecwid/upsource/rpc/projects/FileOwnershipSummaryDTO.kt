// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

/**
 * @param filePath A full path to the file starting with a slash (e.g. /directory/file.txt)
 * @param state See OwnershipSummaryEnum parameters
 * @param userId Upsource user ID
 */
data class FileOwnershipSummaryDTO(
	/**
	 * A full path to the file starting with a slash (e.g. /directory/file.txt) (required)
	 */
	val filePath: String,

	/**
	 * See OwnershipSummaryEnum parameters (required)
	 * 
	 * @see OwnershipSummaryEnum
	 */
	val state: OwnershipSummaryEnum,

	/**
	 * Upsource user ID (optional)
	 */
	val userId: String? = null
) {
	internal constructor() : this(
		filePath = "",
		state = OwnershipSummaryEnum.OK,
		userId = null
	)
}
