package com.ecwid.upsource.rpc.projects

data class CompareGraphDTO(
	/**
	 * See RevisionInfoDTO parameters (repeated)
	 */
	val revisions: List<RevisionInfoDTO>,

	/**
	 * See RevisionListGraphDTO parameters (required)
	 */
	val graph: RevisionListGraphDTO,

	/**
	 * The length of the displayed path from the branching revision to the base (required)
	 */
	val pathToBaseLength: Int,

	/**
	 * The actual length of the path from the branching revision to the base (required)
	 */
	val fullPathToBaseLength: Int,

	/**
	 * The length of the displayed path from the branching revision to the second revision (required)
	 */
	val pathToSecondLength: Int,

	/**
	 * The actual length of the path from the branching revision to the second revision (required)
	 */
	val fullPathToSecondLength: Int
)