package com.ecwid.upsource.rpc.findusages

data class FindBranchResponseDTO(
	/**
	 * The list of matched branches (repeated)
	 */
	val branches: List<String> = emptyList(),

	/**
	 * Whether all available items have been returned or more can be requested by passing the corresponding 'limit' value in the subsequent request (required)
	 */
	val hasMore: Boolean
) {
	internal constructor() : this(
		branches = emptyList(),
		hasMore = false
	)
}
