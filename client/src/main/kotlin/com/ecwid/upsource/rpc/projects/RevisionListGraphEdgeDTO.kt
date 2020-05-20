package com.ecwid.upsource.rpc.projects

data class RevisionListGraphEdgeDTO(
	/**
	 * Edge position index (required)
	 */
	val position: Int,

	/**
	 * Connecting edge position index (required)
	 */
	val toPosition: Int,

	/**
	 * Whether a line is directed up or down (required)
	 */
	val isUp: Boolean,

	/**
	 * Whether a line is solid or dashed (required)
	 */
	val isSolid: Boolean,

	/**
	 * Whether a line ends with an arrow (required)
	 */
	val hasArrow: Boolean,

	/**
	 * Edge color (required)
	 */
	val color: Int
) {
	internal constructor() : this(
		position = 0,
		toPosition = 0,
		isUp = false,
		isSolid = false,
		hasArrow = false,
		color = 0
	)
}
