package com.ecwid.upsource.rpc.users

data class CurrentUserResponseDTO(
	/**
	 * Upsource user ID (required)
	 */
	val userId: String,

	/**
	 * Upsource login (required)
	 */
	val login: String,

	/**
	 * Visible name (required)
	 */
	val name: String,

	/**
	 * The user is a server admin (required)
	 */
	val isServerAdmin: Boolean,

	/**
	 * The user is a guest user (required)
	 */
	val isGuestUser: Boolean,

	/**
	 * The user is a test user (required)
	 */
	val isTestUser: Boolean,

	/**
	 * The user has the right to create projects (required)
	 */
	val canCreateProjects: Boolean,

	/**
	 * See EmailStatusEnum parameters (required)
	 */
	val emailStatus: EmailStatusEnum,

	/**
	 * The list of projects where the user has admin permissions (repeated)
	 */
	val adminPermissionsInProjects: List<String> = emptyList(),

	/**
	 * The list of projects where the user has permission to edit reviews (repeated)
	 */
	val reviewEditPermissionsInProjects: List<String> = emptyList(),

	/**
	 * The list of projects where the user has permission to view reviews (repeated)
	 */
	val reviewViewPermissionsInProjects: List<String> = emptyList(),

	/**
	 * The list of projects where the user has permission to create/merge pull requests (repeated)
	 */
	val codeContributePermissionsInProjects: List<String> = emptyList(),

	/**
	 * Checks if EULA is accepted by the current user. Returns 'null' if EULA is not set up in Hub (optional)
	 */
	val isEULAAccepted: Boolean? = null
) {
	internal constructor() : this(
		userId = "",
		login = "",
		name = "",
		isServerAdmin = false,
		isGuestUser = false,
		isTestUser = false,
		canCreateProjects = false,
		emailStatus = EmailStatusEnum.OK,
		adminPermissionsInProjects = emptyList(),
		reviewEditPermissionsInProjects = emptyList(),
		reviewViewPermissionsInProjects = emptyList(),
		codeContributePermissionsInProjects = emptyList(),
		isEULAAccepted = null
	)
}
