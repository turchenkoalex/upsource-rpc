package com.ecwid.upsource.rpc.findusages

data class UsagesDiffDTO(
	/**
	 * See FilePathToRootDTO parameters (optional)
	 */
	val oldFilePathToRoot: FilePathToRootDTO?,

	/**
	 * See FilePathToRootDTO parameters (optional)
	 */
	val newFilePathToRoot: FilePathToRootDTO?,

	/**
	 * See FindUsagesItemDTO parameters (repeated)
	 */
	val removedUsage: List<FindUsagesItemDTO>,

	/**
	 * See SameUsagesDTO parameters (repeated)
	 */
	val sameUsage: List<SameUsagesDTO>,

	/**
	 * See FindUsagesItemDTO parameters (repeated)
	 */
	val addedUsage: List<FindUsagesItemDTO>
)