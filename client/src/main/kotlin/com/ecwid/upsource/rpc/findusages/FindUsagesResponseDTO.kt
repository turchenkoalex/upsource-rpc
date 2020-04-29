package com.ecwid.upsource.rpc.findusages

data class FindUsagesResponseDTO(
	/**
	 * See FilePathToRootDTO parameters (repeated)
	 */
	val filePathToRoot: List<FilePathToRootDTO>,

	/**
	 * See FindUsagesItemDTO parameters (repeated)
	 */
	val item: List<FindUsagesItemDTO>
)