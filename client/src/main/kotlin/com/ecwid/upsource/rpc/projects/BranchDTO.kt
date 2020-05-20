package com.ecwid.upsource.rpc.projects

data class BranchDTO(
	/**
	 * Project ID in Upsource (required)
	 */
	val projectId: String,

	/**
	 * Branch name (required)
	 */
	val name: String,

	/**
	 * See RevisionInfoDTO parameters (required)
	 */
	val lastRevision: RevisionInfoDTO,

	/**
	 * Whether the branch is a default one (required)
	 */
	val isDefault: Boolean,

	/**
	 * See BranchStatsDTO parameters (required)
	 */
	val stats: BranchStatsDTO,

	/**
	 * Whether the branch is from a hosted repository (required)
	 */
	val isHosted: Boolean,

	/**
	 * ID of the branch review, if one exists (optional)
	 */
	val reviewId: com.ecwid.upsource.rpc.ids.ReviewIdDTO? = null
) {
	internal constructor() : this(
		projectId = "",
		name = "",
		lastRevision = RevisionInfoDTO(),
		isDefault = false,
		stats = BranchStatsDTO(),
		isHosted = false,
		reviewId = null
	)
}
