package com.ecwid.upsource.rpc.projects

data class FindCommitsResponseCommitDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Project name (required)
	 */
	val projectName: String,

	/**
	 * See RevisionInfoDTO parameters (required)
	 */
	val revision: RevisionInfoDTO,

	/**
	 * See RevisionsDiffDTO parameters (optional)
	 */
	val changes: RevisionsDiffDTO? = null
) {
	internal constructor() : this(
		projectId = "",
		projectName = "",
		revision = RevisionInfoDTO(),
		changes = null
	)
}
