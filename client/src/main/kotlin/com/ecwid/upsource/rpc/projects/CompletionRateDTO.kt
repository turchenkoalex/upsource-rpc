package com.ecwid.upsource.rpc.projects

data class CompletionRateDTO(
	/**
	 * Number of reviewers who completed the review, either by accepting or raising concern about the changes (required)
	 */
	val completedCount: Int,

	/**
	 * Total number of reviewers (required)
	 */
	val reviewersCount: Int,

	/**
	 * Whether someone has raised a concern about the changes (required)
	 */
	val hasConcern: Boolean
) {
	internal constructor() : this(
		completedCount = 0,
		reviewersCount = 0,
		hasConcern = false
	)
}
