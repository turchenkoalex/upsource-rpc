package com.ecwid.upsource.rpc.projects

data class ToggleReactionRequestDTO(
	/**
	 * See ReactionTargetDTO parameters (required)
	 */
	val target: ReactionTargetDTO,

	/**
	 * ID of the reaction (required)
	 */
	val reactionId: String,

	/**
	 * Whether to add or remove the reaction (required)
	 */
	val doAdd: Boolean
) {
	internal constructor() : this(
		target = ReactionTargetDTO(),
		reactionId = "",
		doAdd = false
	)
}
